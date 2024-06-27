package com.fatec.controller.interfaces;

import com.fatec.model.entities.User;

public interface UserController {
    
    void createUser(User new_user);
    void removeUser(User remUser);
    void updateUserName(User user, String newName);
    void updateUserEmail(User user, String newEmail);
    User findUser(String userName) throws Exception;
    void showUsers();

}
