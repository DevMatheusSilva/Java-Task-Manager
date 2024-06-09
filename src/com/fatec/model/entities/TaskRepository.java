package com.fatec.model.entities;

import java.util.List;

public class TaskRepository {

    private final List <Task> tasks;
    private int nextId = 1;

    public TaskRepository(List <Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task new_task){
        // Ads a new id to the task and increment nextId
        new_task.setTask_id(nextId++);
        tasks.add(new_task);
    }

    public void removeTask(Task rem_task){
        // Remove the task with the same id
        tasks.removeIf(task -> task.getTask_id() == rem_task.getTask_id());
        // Re-set in nextId
        nextId--;
    }

    public void showAllTasks(){
        tasks.forEach(task -> System.out.println(task));
    }
    
    public Task getTaskById(int id){
        for (Task task : tasks){
            if (task.getTask_id() == id){
                return task;
            }
        }

        return null;
    }

}
