package service;

import user.User;
public class AccountService {
    
    public AccountService() {
        
    }
    
    public User login(String username, String password) {
        if ((username.equals("abe") && password.equals("password")) || (username.equals("barb") && password.equals("password"))) {
            return new User(username, null);
        } else {
            return null;
        }
    }
}
