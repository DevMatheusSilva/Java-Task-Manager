package com.fatec.view;

import java.util.ArrayList;
import com.fatec.controller.impl.*;
import com.fatec.model.entities.*;

import java.util.Scanner;

public class TaskView {

    Scanner sc = new Scanner(System.in);

    TaskControllerImpl taskControl = new TaskControllerImpl(new TaskRepository(new ArrayList<>()));
    UserControllerImpl userControl = new UserControllerImpl(new UserRepository(new ArrayList<>()));

    public String getTaskName(){
        System.out.print("Enter the task name: ");
        String taskName = sc.nextLine();

        return taskName;
    }

    public String getTaskDesc(){
        System.out.print("Enter the task description: ");
        String taskDesc = sc.nextLine();

        return taskDesc;
    }

    public void createTask(){

        String taskName = getTaskName();
        String taskDesc = getTaskDesc();

        Task newTask = new Task(taskName, taskDesc);
        taskControl.createTask(newTask);

        System.out.print("Task created successfully, do you wanna see it? [Y/N]: ");
        int option = sc.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'Y':
                System.out.println("");
                Task task = taskControl.getTaskById(newTask.getTask_id());
                System.out.println(task);
                break;
            case 'N':
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
        
    }

}
