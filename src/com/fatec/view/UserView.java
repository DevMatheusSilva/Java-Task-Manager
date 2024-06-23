package com.fatec.view;

import com.fatec.controller.impl.UserControllerImpl;
import com.fatec.model.entities.UserRepository;
import com.fatec.model.entities.Task;
import com.fatec.model.entities.User;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class UserView {
    Scanner sc = new Scanner(System.in);

    List <User> users = new ArrayList<User>();
    UserControllerImpl userControl = new UserControllerImpl(new UserRepository(users));

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

    public void signUp(){
        String name = getName();
        String email = getEmail();
        String password = getPassword();

        User newUser = new User(email, password, name);
        userControl.createUser(newUser);

        System.out.print("User created successfully, do you wanna see it? [Y/N]: ");
        int option = sc.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'Y':
                System.out.println("");
                User user = userControl.getUserById(newUser.getId());
                System.out.println(user);
                break;
            case 'N':
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }

    }

    public void findUser(int id){
        userControl.getUserById(id);
    }
}
