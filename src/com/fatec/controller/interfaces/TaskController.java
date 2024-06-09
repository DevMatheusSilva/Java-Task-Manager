package com.fatec.controller.interfaces;

import com.fatec.model.entities.Task;

public interface TaskController {

    void createTask(Task new_task);
    void removeTask(Task rem_task);
    Task getTaskById(int id);
    void showAllTasks();

}
