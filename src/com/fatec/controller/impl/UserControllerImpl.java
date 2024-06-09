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
    public User getUserById(int id){
        return repository.getUserById(id);
    }

    @Override
    public void updateUserName(int id, String newName){
        repository.updateUserName(id, newName);
    }
    
    @Override
    public void updateUserEmail(int id, String newEmail){
        repository.updateUserEmail(id, newEmail);
    }
    
}   
