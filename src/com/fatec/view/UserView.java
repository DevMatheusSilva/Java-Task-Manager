package com.fatec.view;

import com.fatec.controller.impl.UserControllerImpl;
import com.fatec.model.entities.User;
import java.util.Scanner;

public class UserView {
    Scanner sc = new Scanner(System.in);

    public String getName(){
        System.out.print("Enter your name: ");
        return sc.nextLine();
    }

    public String getNewName(){
        System.out.print("Enter your new name: ");
        return sc.nextLine();
    }

    public String getEmail(){
        System.out.print("Enter your email: ");
        return sc.nextLine();
    }

    public String getNewEmail(){
        System.out.print("Enter your new email: ");
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

        status("User created succefully do you want to see it?", userControl, newUser, 1);

    }

    public void deleteUser(UserControllerImpl userControl){
        try {
            User remUser = userControl.findUser(getName());
            System.out.println("The following user was founded: \n\n" + remUser);
            status("Do you really want to delete it?", userControl, remUser, 2);
        } catch (Exception e){
            System.out.println("An error occurred: " + e.getMessage() + "\n");
        }
    }
    
    public void updateUserName(UserControllerImpl userControl){
        try {
            User user = userControl.findUser(getName());
            System.out.print("The following user was founded: \n\n" + user);
            status ("Do you really want to update it?", userControl, user, 3);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage() + "\n");
        }
    }

    public void updateUserEmail(UserControllerImpl userControl){
        try {
            User user = userControl.findUser(getName());
            System.out.print("The following user was founded: \n\n" + user);
            status ("Do you really want to update it?", userControl, user, 4);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage() + "\n");
        }
    }

    public void findUser(UserControllerImpl userControl){
        try {
            User user = userControl.findUser(getName());
            System.out.println(user + "\n");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage() + "\n");
        }
    }
    
    public void status(String message, UserControllerImpl userControl, User user, int operationType){
        System.out.print(message + " [Y/N]: ");
        char option = sc.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'Y':
                switch (operationType) {
                    case 1:
                        System.out.println(user + "\n");
                        break;
                    case 2:
                        userControl.removeUser(user);
                        break;
                    case 3:
                        userControl.updateUserName(user, getNewName());
                        break;
                    case 4:
                        userControl.updateUserEmail(user, getNewEmail());
                        break;
                    default:
                        System.out.println("Invalid option!\n");
                        break;
                }
                break;
            case 'N':
                System.out.println("\n");
                break;
            default:
                System.out.println("Invalid option!\n");
                break;
        }
    }

}
