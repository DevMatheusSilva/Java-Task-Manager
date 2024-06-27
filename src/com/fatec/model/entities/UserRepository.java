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
        users.forEach(System.out::println);
    }
    
    public void updateUserName(User user, String new_name){
        user.setName(new_name);
    }
    
    public void updateUserEmail(User user, String newEmail){
        user.setEmail(newEmail);
    }

    public User getUserByName(String userName){
        return users.stream().filter(user -> user.getName().toUpperCase().contains(userName.toUpperCase())).findFirst().orElse(null);
    }

}   
