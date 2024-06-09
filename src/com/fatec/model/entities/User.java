package com.fatec.model.entities;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;


    // Constructor
    public User(String password, String email, String name) {
        this.password = password;
        this.email = email;
        this.name = name;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Show Status
    @Override
    public String toString() {
        return "User { \nname = " + name +
                "\nemail = " + email +
                "\npassword: " + password +
                "\n}";
    }

}
