package com.fatec.view;

import com.fatec.controller.impl.TaskControllerImpl;
import com.fatec.model.entities.Task;

import java.util.Scanner;

public class TaskView {

    Scanner sc = new Scanner(System.in);

    public String getTaskName(){
        System.out.print("Enter the task name: ");
        return sc.nextLine();
    }

    public String getTaskDesc(){
        System.out.print("Enter the task description: ");
        return sc.nextLine();
    }

    public int getTaskId(){
        System.out.print("Enter the task ID: ");
        return sc.nextInt();
    }

    public void createTask(TaskControllerImpl taskControl){

        String taskName = getTaskName();
        String taskDesc = getTaskDesc();

        Task newTask = new Task(taskName, taskDesc);
        taskControl.createTask(newTask);
        

        System.out.print("Task created successfully, do you wanna see it? [Y/N]: ");
        int option = sc.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'Y':
                Task task = taskControl.getTaskById(newTask.getTask_id());
                System.out.println("\n" + task);
                break;
            case 'N':
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
        
    }

    public void findTask(TaskControllerImpl taskControl){
        Task taskFound = taskControl.getTaskById(getTaskId());
        if (taskFound != null){
            System.out.println("\n" + taskFound);
        }
    }

}
