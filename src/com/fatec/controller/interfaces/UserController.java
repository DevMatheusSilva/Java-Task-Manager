package com.fatec.controller.interfaces;

import com.fatec.model.entities.User;

public interface UserController {
    
    void createUser(User new_user);
    void removeUser(User rem_user);
    void updateUserName(String oldName, String newName);
    void updateUserEmail(String userName, String newEmail);
    User getUserByName(String userName);
    void showUsers();

}
