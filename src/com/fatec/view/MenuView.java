package com.fatec.view;

import com.fatec.controller.impl.TaskControllerImpl;
import com.fatec.controller.impl.UserControllerImpl;
import com.fatec.model.entities.TaskRepository;
import com.fatec.model.entities.UserRepository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuView {

    public void showOptions(){

        Scanner sc = new Scanner (System.in);

        TaskControllerImpl taskControl = new TaskControllerImpl(new TaskRepository(new ArrayList<>()));
        UserControllerImpl userControl = new UserControllerImpl(new UserRepository(new ArrayList<>()));

        while (true) {
            try {
                System.out.println("Welcome to Task Manager\n");
                System.out.println("1 - Create task");
                System.out.println("2 - Delete task");
                System.out.println("3 - Update task name");
                System.out.println("4 - Update task description");
                System.out.println("5 - Search task");
                System.out.println("6 - Show tasks");
                System.out.println("7 - Create user");
                System.out.println("8 - Delete user");
                System.out.println("9 - Update user name");
                System.out.println("10 - Update user Email");
                System.out.println("11 - Search user");
                System.out.println("12 - Show users");
                System.out.println("13 - Exit");

                TaskView taskview = new TaskView();
                UserView userview = new UserView();

                System.out.print("\nChoose an option: ");

                switch (sc.nextInt()) {

                    case 1:
                        System.out.println("\nLet's create a task");
                        taskview.createTask(taskControl);
                        break;
                    case 2:
                        System.out.println("\nLet's delete a task");
                        taskview.deleteTask(taskControl);
                        break;
                    case 3:
                        System.out.println("\nLet's update a task name");
                        taskview.updateTaskName(taskControl);
                        break;
                    case 4:
                        System.out.println("\nLet's update a task description");
                        taskview.updateTaskDesc(taskControl);
                        break;
                    case 5:
                        System.out.println("\nLet's search a task");
                        taskview.findTask(taskControl);
                        break;
                    case 6:
                        System.out.println("\nThis is the list of all tasks\n");
                        taskControl.showAllTasks();
                        break;
                    case 7:
                        System.out.println("\nLet's create a user");
                        userview.signUp(userControl);
                        break;
                    case 8:
                        System.out.println("\nLet's delete a user");
                        userview.deleteUser(userControl);
                        break;
                    case 9:
                        System.out.println("\nLet's update a user name");
                        userview.updateUserName(userControl);
                        break;
                    case 10:
                        System.out.println("\nLet's update a user email");
                        userview.updateUserEmail(userControl);
                        break;
                    case 11:
                        System.out.println("\nLet's search a user");
                        userview.findUser(userControl);
                        break;
                    case 12:
                        System.out.println("\nThis is the list of all users\n");
                        userControl.showUsers();
                        break;
                    case 13:
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid option!");

                }
            } catch (InputMismatchException e){

                System.out.println("Invalid input ! Please enter a number.");
                sc.next();

            }

        }

    }

}