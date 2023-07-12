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


}
