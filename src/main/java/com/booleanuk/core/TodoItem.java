package com.booleanuk.core;

public class TodoItem {
    private String title;
    private String detail;
    private String status;

    public TodoItem(String title, String detail) {
        this.title = title;
        this.detail = detail;
        this.status = "incomplete";
    }

    private void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void markAsComplete() {
        this.setStatus("complete");
    }

    public void markAsIncomplete() {
        this.setStatus("incomplete");
    }
}
