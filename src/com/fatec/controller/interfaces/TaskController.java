package com.fatec.controller.interfaces;

import com.fatec.model.entities.Task;

public interface TaskController {

    void createTask(Task newTask);
    void removeTask(Task remtask);
    void updateTaskName(Task task, String newName);
    void updateTaskDesc(Task task, String newDesc);
    Task findTask(String taskName) throws Exception;
    void checkTask(Task task);
    void showAllTasks();

}
