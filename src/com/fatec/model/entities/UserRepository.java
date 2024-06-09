package com.fatec.model.entities;

import java.util.List;

public class UserRepository {

    private final List <User> users;
    private int nextId = 1;

    public UserRepository(List <User> users) {
        this.users = users;
    }

    public void addUser(User new_user){
        new_user.setId(nextId++);
        users.add(new_user);
    }

    public void removeUser(User rem_user){
        users.removeIf(user -> user.getId() == rem_user.getId());
        nextId--;
    }

    public void showUsers(){
        users.forEach(user -> System.out.println(user));
    }
    
    public User getUserById(int id){
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }
    
}   