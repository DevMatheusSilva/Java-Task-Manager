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

}
