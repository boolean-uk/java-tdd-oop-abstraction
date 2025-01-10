package com.booleanuk.core;

public class TodoItem {
    private String title;
    private String detail;
    private String status;

    public TodoItem() {
        this.title = title;
        this.detail = detail;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
