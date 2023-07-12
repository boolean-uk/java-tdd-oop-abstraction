package com.booleanuk.core;

public class TodoItem {
    private String title;
    private String detail;
    private String status;

    public TodoItem(String title, String detail) {
        this.title = title;
        this.detail = detail;
        this.status = "InCompleted";
    }

    public void setStatusCompleted() {
        this.status = "Completed";
    }
    public void setStatusInCompleted() {
        this.status = "InCompleted";
    }

    public String getStatus() {
        return this.status;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public String getTitle() {
        return title;
    }
}
