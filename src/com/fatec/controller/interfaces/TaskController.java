package com.fatec.controller.interfaces;

import com.fatec.model.entities.Task;

public interface TaskController {

    void createTask(Task new_task);
    void removeTask(String remName);
    void updateTaskName(String oldName, String newName);
    void updateTaskDesc(String taskName, String newDesc);
    Task getTaskByName(String taskName);
    void showAllTasks();

}
