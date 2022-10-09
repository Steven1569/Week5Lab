
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.AccountService;
import user.User;

/**
 *
 * @author Steven
 */
public class LoginServlet extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String logout = request.getParameter("logout");
        if (logout != null) {
            request.getSession().invalidate();
            request.setAttribute("message", "Successfully logged out.");
            
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }

        if (logout == null && request.getSession().getAttribute("user") == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }

        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("home");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        request.setAttribute("username", username);
        request.setAttribute("password", password);

        if (username.equals("") || username == null || password.equals("") || password == null) {

            request.setAttribute("message", "Username or password invalid.");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

        } else 
            {
            AccountService check = new AccountService();
            User user = check.login(username, password);

            if (user == null) {
                request.setAttribute("message", "Not a valid login");
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            } else {
                request.getSession().setAttribute("user", user);
                response.sendRedirect("home");
         }
      }    
    }      
}
