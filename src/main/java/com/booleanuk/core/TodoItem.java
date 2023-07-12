package com.booleanuk.core;

public class TodoItem {
    private String title;
    private String details;
    private boolean isCompleted;

    public TodoItem(String title, String details) {
        this.title = title;
        this.details = details;
        this.isCompleted = false;
    }

    public void changeStatus() {
        this.isCompleted = !this.isCompleted;
    }

    public boolean getStatus() {
        return this.isCompleted;
    }

    public String getTitle() {
        return title;
    }

    public void changeTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void changeDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "title='" + title + '\'' +
                ", details='" + details + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
