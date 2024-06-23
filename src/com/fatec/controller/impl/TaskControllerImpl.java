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
    public void removeTask(String remName) {
        Task rem_task = repository.getTaskByName(remName);
        repository.removeTask(rem_task);
    }

    @Override
    public void showAllTasks() {
        repository.showAllTasks();
    }
    
    @Override
    public Task getTaskByName(String taskName) {
        return repository.getTaskByName(taskName);
    }
    
    @Override
    public void updateTaskName(String oldName, String newName){
        repository.updateTaskName(oldName, newName);
    }

    @Override
    public void updateTaskDesc(String taskName, String newDesc){
        repository.updateTaskDesc(taskName, newDesc);
    }

}
