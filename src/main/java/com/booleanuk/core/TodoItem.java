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

    public TodoItem(String title, String detail, String status) {
        this(title, detail);
    }

    public void changeStatus() {
        if (status.equals("incomplete")) {
            status = "complete";
        } else {
            status = "incomplete";
        }
    }

    public void setStatus(String status) {
        if ((status.equals("incomplete") || status.equals("complete")) && !status.equals(this.status)) {
            changeStatus();
        }
    }

    public String getStatus() {
        return this.status;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDetail() {
        return  this.detail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
