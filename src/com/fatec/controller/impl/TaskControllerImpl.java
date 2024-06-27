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
    public void createTask(Task newTask) {
        repository.addTask(newTask);
    }

    @Override
    public void removeTask(Task remTask) {
        if (remTask != null) repository.removeTask(remTask);
    }

    @Override
    public void showAllTasks() {
        repository.showAllTasks();
    }
    
    @Override
    public Task findTask(String taskName) throws Exception{
        Task task = repository.getTaskByName(taskName);
        if (task == null) throw new Exception ("The task '" + taskName + "' was not found!");
        return task;
    }

    @Override
    public void updateTaskName(Task task, String newName){
        repository.updateTaskName(task, newName);
    }

    @Override
    public void checkTask(Task task){
        if (task != null) repository.checkTask(task);
    }

    @Override
    public void updateTaskDesc(Task task, String newDesc){
        repository.updateTaskDesc(task, newDesc);
    }

}
