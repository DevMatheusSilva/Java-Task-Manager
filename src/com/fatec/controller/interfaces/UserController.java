package com.fatec.controller.interfaces;

import com.fatec.model.entities.User;

public interface UserController {
    
    void createUser(User new_user);
    void removeUser(User rem_user);
    User getUserById(int id);
    void showUsers();

}
