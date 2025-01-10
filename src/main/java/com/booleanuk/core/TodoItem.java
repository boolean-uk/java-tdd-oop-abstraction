package com.booleanuk.core;

public class TodoItem {
    private String title;
    private String detail;
    private String status;

    public TodoItem(String title, String detail, String status) {
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

    public String getTitle(){return this.title;}

    public void changeTitle(String newTitle){this.title = newTitle;}

    public String getDetail(){return this.detail;}

    public void updateDetails(String newDetails){this.detail = newDetails;}
}
