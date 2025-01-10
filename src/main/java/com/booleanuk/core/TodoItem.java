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

    public void setStatusToComplete() {
        this.status = "Complete";
    }

    public void setStatusToInComplete() {
        this.status = "Incomplete";
    }

    public String getStatus() {
        return this.status;
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
