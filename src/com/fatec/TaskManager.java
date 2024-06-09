package com.fatec;

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

        Task testTask = new Task("Test Name", "This is a Test Task", false);
        Task secondTestTask = new Task("Second Test Name", "This is a Second Test Task", false);
        control.createTask(testTask);
        control.createTask(secondTestTask);

        User testUser = new User("abc", "u1@gmeil.com", "Test User 1");
        User secondTestUser = new User("123", "u2@gmeil.com", "Test User 2");
        user_control.createUser(testUser);
        user_control.createUser(secondTestUser);
        
        System.out.println("Shows the tasks and users created\n");
        System.out.println("Tasks\n");
        control.showAllTasks();
        System.out.println("Users\n");
        user_control.showUsers();

        control.removeTask(secondTestTask.getTask_id());
        user_control.removeUser(secondTestUser);

        System.out.println("Shows the tasks and users after removing the second task and user\n");
        System.out.println("Tasks");
        control.showAllTasks();
        System.out.println("Users");
        user_control.showUsers();

        control.createTask(secondTestTask);
        user_control.createUser(secondTestUser);

        System.out.println("Shows the tasks and users after adding the second task and user again\n");
        System.out.println("Tasks");
        control.showAllTasks();
        System.out.println("Users");
        user_control.showUsers();

        System.out.println("Updating the task name");
        control.updateTaskName(secondTestTask.getTask_id(), "Second-Test-Name");
        control.showAllTasks();

        System.out.println("Updating the user name");
        user_control.updateUserName(secondTestUser.getId(), "Second-Test-User");
        user_control.showUsers();

        System.out.println("Updating the task description");
        control.updateTaskDesc(secondTestTask.getTask_id(), "This is the updated description of the second task");
        control.showAllTasks();

        System.out.println("Updating the user email");
        user_control.updateUserEmail(secondTestUser.getId(), "seconduser@gmeil.com");
        user_control.showUsers();

    }

}
