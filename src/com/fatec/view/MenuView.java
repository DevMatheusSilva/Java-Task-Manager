package com.fatec.view;

import com.fatec.controller.impl.TaskControllerImpl;
import com.fatec.model.entities.TaskRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuView {

    public void showOptions(){

        Scanner sc = new Scanner (System.in);
        boolean cont = true;

        TaskControllerImpl taskControl = new TaskControllerImpl(new TaskRepository(new ArrayList<>()));

        do {

            System.out.println("Welcome to Task Manager\n");
            System.out.println("1 - Create Task");
            System.out.println("2 - Create User");
            System.out.println("3 - Find Task");
            System.out.println("4 - Find User");
            System.out.println("10 - Exit");

            TaskView taskview = new TaskView();
            UserView userview = new UserView();

            System.out.print("\nChoose an option: ");

            switch (sc.nextInt()){

                case 1:
                    System.out.println("\nLet's create a task");
                    taskview.createTask(taskControl);
                    break;
                case 2:
                    System.out.println("\nLet's create a user");
                    userview.signUp();
                    break;
                case 3:
                    System.out.println("\nFind task by ID");
                    taskview.findTask(taskControl);
                    break;
                case 4:
                    System.out.println("\nFind user by ID");

                    break;
                case 10:
                    System.out.println("Exiting...");
                    cont = false;
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option!");
                  
            }
            
        } while (cont);

    }

}