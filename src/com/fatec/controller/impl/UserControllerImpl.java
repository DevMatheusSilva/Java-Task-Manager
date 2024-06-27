package com.fatec.controller.impl;

import com.fatec.model.entities.User;
import com.fatec.controller.interfaces.UserController;
import com.fatec.model.entities.UserRepository;

public class UserControllerImpl implements UserController{

    UserRepository repository;

    public UserControllerImpl(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public void createUser(User new_user) {
        repository.addUser(new_user);
    }

    @Override
    public void removeUser(User remUser) {
        if (remUser != null) repository.removeUser(remUser);
    }

    @Override
    public void showUsers() {
        repository.showUsers();
    }

    @Override
    public void updateUserName(User user, String newName){
        repository.updateUserName(user, newName);
    }

    @Override
    public User findUser(String userName) throws Exception{
        User user = repository.getUserByName(userName);
        if (user == null) throw new Exception ("The user '" + userName + "' was not found!");
        return user;
    }

    @Override
    public void updateUserEmail(User user, String newEmail){
        repository.updateUserEmail(user, newEmail);
    }
    
}   
