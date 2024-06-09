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

    public void updateUserName(int id, String new_name){
        User user = getUserById(id);
        user.setName(new_name);
    }
    
    public void updateUserEmail(int id, String newEmail){
        User user = getUserById(id);
        user.setEmail(newEmail);
    }

    public User getUserById(int id){
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }
    
}   
