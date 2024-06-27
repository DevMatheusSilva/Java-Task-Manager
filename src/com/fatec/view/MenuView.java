package com.fatec.view;

import com.fatec.controller.impl.TaskControllerImpl;
import com.fatec.model.entities.TaskRepository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuView {

    public void showOptions(){

        Scanner sc = new Scanner (System.in);

        TaskControllerImpl taskControl = new TaskControllerImpl(new TaskRepository(new ArrayList<>()));

        while (true) {
            try {
                System.out.println("Welcome to Task Manager\n");
                System.out.println("1 - Create task");
                System.out.println("2 - Delete task");
                System.out.println("3 - Update task name");
                System.out.println("4 - Update task description");
                System.out.println("5 - Search task");
                System.out.println("6 - Show tasks");
                System.out.println("7 - Check a task");
                System.out.println("8 - Exit");

                TaskView taskView = new TaskView();

                System.out.print("\nChoose an option: ");

                switch (sc.nextInt()) {

                    case 1:
                        System.out.println("\nLet's create a task\n");
                        taskView.createTask(taskControl);
                        break;
                    case 2:
                        System.out.println("\nLet's delete a task\n");
                        taskView.deleteTask(taskControl);
                        break;
                    case 3:
                        System.out.println("\nLet's update a task name\n");
                        taskView.updateTaskName(taskControl);
                        break;
                    case 4:
                        System.out.println("\nLet's update a task description\n");
                        taskView.updateTaskDesc(taskControl);
                        break;
                    case 5:
                        System.out.println("\nLet's search a task\n");
                        taskView.findTask(taskControl);
                        break;
                    case 6:
                        System.out.println("\nThis is the list of all tasks\n");
                        taskControl.showAllTasks();
                        break;
                    case 7:
                        System.out.println("\nLet's complete a task\n");
                        taskView.checkTask(taskControl);
                        break;
                    case 8:
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