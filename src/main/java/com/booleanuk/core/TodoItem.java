package com.booleanuk.core;


public class TodoItem {
    private String title;
    private String detail;
    private boolean isCompleted;


    public TodoItem(String title, String detail) {
        this.title = title;
        this.detail = detail;
        this.isCompleted = false;
    }

    public boolean isCompleted() {
        return isCompleted;
    }


    public void completeTask() {
        this.isCompleted = true;
    }

    public void continueWithTask() {
        this.isCompleted = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
