package com.fatec.model.entities;

import com.fatec.model.entities.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    private List <Task> tasks = new ArrayList<>();
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
    }

}
