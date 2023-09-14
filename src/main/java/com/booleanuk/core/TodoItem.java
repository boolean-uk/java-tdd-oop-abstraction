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

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }
}
