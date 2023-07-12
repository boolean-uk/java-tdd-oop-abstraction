package com.booleanuk.core;

public class TodoItem {
    private String title;
    private String detail;
    private boolean isCompleted;

    public TodoItem(String title, String detail) {
        this.setTitle(title);
        this.setDetail(detail);
        isCompleted = false;
    }

    public void changeIsCompleted() {
        isCompleted = !isCompleted;
    }

    public boolean getIsCompleted() {
        return this.isCompleted;
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
