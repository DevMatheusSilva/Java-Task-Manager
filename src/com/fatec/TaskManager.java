package com.fatec;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import com.fatec.model.entities.Task;
import com.fatec.controller.impl.TaskControllerImpl;
import com.fatec.model.entities.TaskRepository;


public class TaskManager {

    public static void main(String[] args) {

        List <Task> tasks = new ArrayList <> (); // Create a list to track all tasks
        TaskRepository repository = new TaskRepository(tasks); // Create a repository to work on the tasks
        TaskControllerImpl control = new TaskControllerImpl(repository); // Create a controller to control the tasks

        LocalDate date = LocalDate.now(); // The actual date

        Task testTask = new Task("Test Name", "This is a Test Task", date, false); // Create a test task
        Task secondTestTask = new Task("Second Test Name", "This is a Second Test Task", date, false); // Create a second test task

        control.createTask(testTask); // Make the controller create a task
        control.createTask(secondTestTask);

        for (Task task : tasks){ // Show the tasks (move to the view)
            System.out.println(task.toString());
        }

    }

}
