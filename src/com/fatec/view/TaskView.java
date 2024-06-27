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

    public String getNewTaskName(){
        System.out.print("Enter the task's new name: ");
        return sc.nextLine();
    }

    public String getTaskDesc(){
        System.out.print("Enter the task description: ");
        return sc.nextLine();
    }

    public String getNewTaskDesc(){
        System.out.print("Enter the task's new description: ");
        return sc.nextLine();
    }

    public void createTask(TaskControllerImpl taskControl){

        String taskName = getTaskName();
        String taskDesc = getTaskDesc();

        Task newTask = new Task(taskName, taskDesc);
        taskControl.createTask(newTask);
        
        status("\nTask created successfully, do you wanna see it?", taskControl, newTask, 1);
        
    }

    public void deleteTask(TaskControllerImpl taskControl){
        try {
            Task remTask = taskControl.findTask(getTaskName());
            System.out.println("\nThe following task was founded: \n\n" + remTask);
            status ("\nDo you really want to delete it?", taskControl, remTask, 2);
        } catch (Exception e){
            System.out.println("An error occurred: " + e.getMessage() + "\n");
        }
    }

    public void updateTaskName(TaskControllerImpl taskControl){
        try {
            Task task = taskControl.findTask(getTaskName());
            System.out.println("\nThe following task was founded: \n\n" + task);
            status("\nDo you really want to update it?", taskControl, task, 3);    
        } catch (Exception e){
            System.out.println("\nAn error occurred: " + e.getMessage() + "\n");
        }
    }

    public void updateTaskDesc(TaskControllerImpl taskControl){
        try {
            Task task = taskControl.findTask(getTaskName());
            System.out.println("\nThe following task was founded: \n\n" + task);
            status("\nDo you really want to update it?", taskControl, task, 4);
        } catch (Exception e){
            System.out.println("\nAn error occurred: " + e.getMessage() + "\n");
        }
    }

    public void findTask(TaskControllerImpl taskControl){
        try {
            Task taskFound = taskControl.findTask(getTaskName());
            System.out.println("\n" + taskFound + "\n");
        } catch (Exception e){
            System.out.println("An error occurred: " + e.getMessage() + "\n");
        }
    }

    public void checkTask(TaskControllerImpl taskControl){
        try {
            Task task = taskControl.findTask(getTaskName());
            status("\nDo you really want to check it?", taskControl, task, 5);
            
            System.out.println("\nTask checked successfully!\n");
        } catch (Exception e){
            System.out.println("An error occurred: " + e.getMessage() + "\n");
        }
    }

    public void status(String message, TaskControllerImpl taskControl, Task task, int operationType){
        System.out.print(message + " [Y/N]: ");
        char option = sc.nextLine().toUpperCase().charAt(0);

        switch (option) {
            case 'Y':
                switch (operationType) {
                    case 1:
                        System.out.print("\n" + task + "\n");
                        break;
                    case 2:
                        taskControl.removeTask(task);
                        System.out.println("\nTask removed successfully!\n");
                        break;
                    case 3:
                        System.out.println();
                        taskControl.updateTaskName(task, getNewTaskName());
                        System.out.println("\nTask name updated successfully!\n");
                        break;
                    case 4:
                        System.out.println();
                        taskControl.updateTaskDesc(task, getNewTaskDesc());
                        System.out.println("\nTask description updated successfully!\n");
                        break;
                    case 5:
                        System.out.println();
                        taskControl.checkTask(task);
                        System.out.println("\nTask checked successfully!\n");
                        break;
                    default:
                        System.out.println("\nInvalid option!\n");
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
