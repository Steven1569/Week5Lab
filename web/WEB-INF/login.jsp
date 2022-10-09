<%-- 
    Document   : login
    Created on : Oct 9, 2022, 12:46:50 PM
    Author     : Steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post" action="login">
            Username: <input type="username" name="username" value="${username}"><br>
            Password: <input type="password" name="password" value="${password}"><br>
            <input type="submit" value="login"><br>
        </form>
        <p>${message}</p>
    </body>
</html>
