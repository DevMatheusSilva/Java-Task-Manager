package com.fatec.controller.interfaces;

import com.fatec.model.entities.User;

public interface UserController {
    
    void createUser(User new_user);
    void removeUser(User rem_user);
    void updateUserName(int id, String newName);
    void updateUserEmail(int id, String newEmail);
    User getUserById(int id);
    void showUsers();

}
