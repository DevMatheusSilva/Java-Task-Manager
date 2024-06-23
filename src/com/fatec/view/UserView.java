package com.fatec.view;

import com.fatec.controller.impl.TaskControllerImpl;
import com.fatec.controller.impl.UserControllerImpl;
import com.fatec.model.entities.User;
import java.util.Scanner;

public class UserView {
    Scanner sc = new Scanner(System.in);

    public String getName(){
        System.out.print("Enter your name: ");
        return sc.nextLine();
    }

    public String getEmail(){
        System.out.print("Enter your email: ");
        return sc.nextLine();
    }

    public String getPassword(){
        System.out.print("Enter your password: ");
        return sc.nextLine();
    }

    public void signUp(UserControllerImpl userControl){
        String name = getName();
        String email = getEmail();
        String password = getPassword();

        User newUser = new User(email, password, name);
        userControl.createUser(newUser);

        System.out.print("User created successfully, do you wanna see it? [Y/N]: ");
        int option = sc.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'Y':
                User user = userControl.getUserByName(newUser.getName());
                System.out.println("\n" + user);
                break;
            case 'N':
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }

    }

    public void findUser(UserControllerImpl userControl){
        User userFound = userControl.getUserByName(getName());
        if (userFound != null){
            System.out.println("\n" + userFound);
        }
    }
}
