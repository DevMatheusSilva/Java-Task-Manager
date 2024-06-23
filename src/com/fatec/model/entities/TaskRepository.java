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

    public void updateTaskName(int id, String new_name){
        Task task = getTaskById(id);
        task.setTask_name(new_name);
    }
    
    public void updateTaskDesc(int id, String newDesc){
        Task task = getTaskById(id);
        task.setDesc(newDesc);
    }

    public Task getTaskById(int id){
        try{
            Task reTask = tasks.stream().filter(task -> task.getTask_id() == id).findFirst().orElse(null);
            if (reTask == null){
                throw new Exception("The task with the id " + id + " was not founded");
            } else {
                return reTask;
            }
        } catch (Exception e){
            System.out.println("\nAn error occurred: " + e.getMessage() + "\n");
            return null;
        }

    }
    
}
