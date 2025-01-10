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

    public boolean setTitle(String title) {
        if (!title.equals("")) {
            this.title = title;
            return true;
        }
        return false;
    }

    public String getDetail() {
        return detail;
    }

    public boolean setDetail(String detail) {
        if (!detail.equals("")) {
            this.detail = detail;
            return true;
        }
        return false;
    }
}
