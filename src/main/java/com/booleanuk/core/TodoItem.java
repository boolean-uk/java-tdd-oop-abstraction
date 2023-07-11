package com.booleanuk.core;

public class TodoItem {
    private String title;
    private String detail;
    private String status;

    public TodoItem(String title, String detail) {
        this.setTitle(title);
        this.setDetail(detail);
        this.status = "incomplete";
    }

    public String changeToComplete() {
        this.status = "complete";
        return this.status;
    }

    public boolean isComplete() {
        return !this.status.equals("incomplete");
    }

    public String details(){
        return "title: " + this.title + "details: " + this.detail + "status: " +  this.status;
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
