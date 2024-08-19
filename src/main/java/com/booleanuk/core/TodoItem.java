package com.booleanuk.core;

public class TodoItem {
    private String title;
    private String detail;
    private boolean status;

    public TodoItem(String title, String detail) {
        this.title = title;
        this.detail = detail;
        this.status = false;
    }
    public void toggleStatus() {
        this.status = !status;
    }
    public boolean getStatus() {

        return this.status;
    }
    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }
}
