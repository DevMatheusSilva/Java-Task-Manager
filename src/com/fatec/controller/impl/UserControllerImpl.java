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
    public void removeUser(User rem_user) {
        repository.removeUser(rem_user);
    }

    @Override
    public void showUsers() {
        repository.showUsers();
    }
    
    @Override
    public User getUserByName(String userName){
        return repository.getUserByName(userName);
    }

    @Override
    public void updateUserName(String oldName, String newName){
        repository.updateUserName(oldName, newName);
    }
    
    @Override
    public void updateUserEmail(String userName, String newEmail){
        repository.updateUserEmail(userName, newEmail);
    }
    
}   
