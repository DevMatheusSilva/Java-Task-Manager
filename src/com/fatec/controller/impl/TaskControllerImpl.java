package com.fatec.controller.impl;

import com.fatec.model.entities.Task;

import com.fatec.controller.interfaces.TaskController;
import com.fatec.model.entities.TaskRepository;

public class TaskControllerImpl implements TaskController{

    TaskRepository repository;

    public TaskControllerImpl(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createTask(Task new_task) {
        repository.addTask(new_task);
    }

    @Override
    public void removeTask(Task rem_task) {
        repository.removeTask(rem_task);
    }

    @Override
    public void showAllTasks() {
        repository.showAllTasks();
    }
    
    @Override
    public Task getTaskById(int id) {
        return repository.getTaskById(id);
    }
    
}
