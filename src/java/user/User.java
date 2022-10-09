package user;
import java.io.Serializable;
/**
 *
 * @author Steven
 */

public class User implements Serializable {
    
    String username;
    String password;
    
    public User() {
        this.username = null;
        this.password = null;
    }
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
