package com.fatec;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import com.fatec.model.entities.Task;
import com.fatec.model.entities.User;
import com.fatec.controller.impl.TaskControllerImpl;
import com.fatec.controller.impl.UserControllerImpl;
import com.fatec.model.entities.TaskRepository;
import com.fatec.model.entities.UserRepository;


public class TaskManager {

    public static void main(String[] args) {

        List <Task> tasks = new ArrayList <> ();
        List <User> users = new ArrayList <> ();
        
        TaskRepository repository = new TaskRepository(tasks);
        TaskControllerImpl control = new TaskControllerImpl(repository);
        UserRepository user_repository = new UserRepository(users);
        UserControllerImpl user_control = new UserControllerImpl(user_repository);

        LocalDate date = LocalDate.now();

        Task testTask = new Task("Test Name", "This is a Test Task", date, false);
        Task secondTestTask = new Task("Second Test Name", "This is a Second Test Task", date, false);
        User testUser = new User("abc", "u1@gmeil.com", "Test User 1");
        User secondTestUser = new User("123", "u2@gmeil.com", "Test User 2");

        control.createTask(testTask);
        control.createTask(secondTestTask);
        user_control.createUser(testUser);
        user_control.createUser(secondTestUser);

        //-----------------------------------------------------------------------------------
        System.out.println("Shows the tasks and users created\n");
        
        System.out.println("Tasks\n");
        control.showAllTasks();

        System.out.println("Users\n");
        user_control.showUsers();
        //-----------------------------------------------------------------------------------


        control.removeTask(secondTestTask);
        user_control.removeUser(secondTestUser);


        //-----------------------------------------------------------------------------------
        System.out.println("Shows the tasks and users after removing the second task and user\n");
        
        System.out.println("Tasks");
        control.showAllTasks();

        System.out.println("Users");
        user_control.showUsers();
        //-----------------------------------------------------------------------------------


        control.createTask(secondTestTask);
        user_control.createUser(secondTestUser);


        //-----------------------------------------------------------------------------------
        System.out.println("Shows the tasks and users after adding the second task and user again\n");
        
        System.out.println("Tasks");
        control.showAllTasks();

        System.out.println("Users");
        user_control.showUsers();
        //-----------------------------------------------------------------------------------
        
        System.out.println("Getting the task by id\n");
        System.out.println(control.getTaskById(1));
        
        System.out.println("Getting the user by id\n");
        System.out.println(user_control.getUserById(1));

    }

}
