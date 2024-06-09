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

        // Task
        List <Task> tasks = new ArrayList <> ();
        TaskRepository repository = new TaskRepository(tasks);
        TaskControllerImpl control = new TaskControllerImpl(repository);
        LocalDate date = LocalDate.now();

        Task testTask = new Task("Test Name", "This is a Test Task", date, false);
        Task secondTestTask = new Task("Second Test Name", "This is a Second Test Task", date, false);

        control.createTask(testTask);
        control.createTask(secondTestTask);

        // User
        List <User> users = new ArrayList <> ();
        UserRepository user_repository = new UserRepository(users);
        UserControllerImpl user_control = new UserControllerImpl(user_repository);

        User testUser = new User("abc", "u1@gmeil.com", "Test User 1");
        User secondTestUser = new User("123", "u2@gmeil.com", "Test User 2");

        user_control.createUser(testUser);
        user_control.createUser(secondTestUser);


        System.out.println("-------------------------------------------------------");
        System.out.println("Tasks");
        for (Task task : tasks){
            System.out.println(task.toString());
        }

        System.out.println("Users");
        for (User user : users){
            System.out.println(user.toString());
        }

        control.removeTask(secondTestTask);
        user_control.removeUser(secondTestUser);

        System.out.println("-------------------------------------------------------");
        System.out.println("Tasks");
        for (Task task : tasks){
            System.out.println(task.toString());
        }

        System.out.println("Users");
        for (User user : users){
            System.out.println(user.toString());
        }

        control.createTask(secondTestTask);
        user_control.createUser(secondTestUser);

        System.out.println("-------------------------------------------------------");
        System.out.println("Tasks");
        for (Task task : tasks){
            System.out.println(task.toString());
        }

        System.out.println("Users");
        for (User user : users){
            System.out.println(user.toString());
        }

    }

}
