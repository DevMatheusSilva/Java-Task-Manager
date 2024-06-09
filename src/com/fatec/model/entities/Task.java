package com.fatec.model.entities;

import java.time.LocalDate;

public class Task {
    private int task_id;
    private String task_name;
    private String desc;
    private LocalDate due_date;
    private boolean completed;

    // Constructor
    public Task(String task_name, String desc, LocalDate due_date, boolean completed) {
        this.task_name = task_name;
        this.desc = desc;
        this.due_date = due_date;
        this.completed = completed;
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

    public LocalDate getDueDate() {
        return due_date;
    }

    public void setDueDate(LocalDate due_date) {
        this.due_date = due_date;
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
        return "Task { \ntask_id = " + task_id + "\ntask_name = " + task_name +
                "\ndesc = " + desc + "\ndue_date = " + due_date +
                "\ncompleted = " + completed + "\n}" +
                "\n";
    }
}
