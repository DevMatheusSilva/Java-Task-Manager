package com.fatec.controller.interfaces;

import com.fatec.model.entities.Task;

public interface TaskController {

    void createTask(Task new_task);
    void removeTask(int id);
    void updateTaskName(int id, String newName);
    void updateTaskDesc(int id, String newDesc);
    Task getTaskById(int id);
    void showAllTasks();

}
