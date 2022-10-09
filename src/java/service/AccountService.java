
package service;

import user.User;

public class AccountService {
    public User login(String username, String password){
        if(username.equals("abe") || username.equals("barb") && password.equals("password")){
            User user = new User(username, "null");
            return user;
        }
        return null;
    }   
}
