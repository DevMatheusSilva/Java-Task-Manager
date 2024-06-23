package com.fatec.model.entities;

import java.time.LocalDate;

public class Task {
    private int task_id;
    private String task_name;
    private String desc;
    private LocalDate date;
    private boolean completed;

    // Constructor
    public Task(String task_name, String desc) {
        this.task_name = task_name;
        this.desc = desc;
        completed = false;
        date = LocalDate.now();
    }

    // Getters and Setters
    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int id){
        this.task_id = id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDueDate(LocalDate date) {
        this.date = date;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Show Status
    @Override
    public String toString() {
        return "Task {\ntask_name = " + task_name +
                "\ndesc = " + desc + "\ndate = " + date +
                "\ncompleted = " + completed + "\n}" +
                "\n";
    }

}
