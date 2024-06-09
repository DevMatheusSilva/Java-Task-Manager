package com.fatec.model.entities;

import com.fatec.model.entities.User;

import java.util.List;

public class UserRepository {

    private final List <User> users;
    private int nextId = 1;

    public UserRepository(List <User> users) {
        this.users = users;
    }

    public void addUser(User new_user){
        // Adds a new user and increments id
        new_user.setId(nextId++);
        users.add(new_user);
    }

    public void removeUser(User rem_user){
        // Remove the user with the same id
        users.removeIf(user -> user.getId() == rem_user.getId());
        // Decrements the id
        nextId--;
    }

}