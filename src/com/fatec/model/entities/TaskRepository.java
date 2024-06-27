package com.fatec.model.entities;

import java.util.List;

public class TaskRepository {

    private final List <Task> tasks;
    private int nextId = 1;

    public TaskRepository(List <Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task new_task){
        new_task.setTask_id(nextId++);
        tasks.add(new_task);
    }

    public void removeTask(Task rem_task){
        tasks.removeIf(task -> task.getTask_id() == rem_task.getTask_id());
        nextId--;
    }

    public void showAllTasks(){
        tasks.forEach(System.out::println);
    }

    public void updateTaskName(Task task, String new_name){
        task.setTask_name(new_name);
    }
    
    public void updateTaskDesc(Task task, String newDesc){
        task.setDesc(newDesc);
    }

    public Task getTaskByName(String taskName){
        return tasks.stream().filter(task -> task.getTask_name().toUpperCase().contains(taskName.toUpperCase())).findFirst().orElse(null);
    }
    
    public void checkTask(Task task){
        task.setCompleted(true);
    }
    
}
