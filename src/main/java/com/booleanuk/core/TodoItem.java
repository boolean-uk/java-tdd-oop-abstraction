package com.booleanuk.core;

public class TodoItem {
    private String title;
    private String detail;
    private String status;

    public TodoItem(String title, String detail, String status) {
//        setTitle(title);
//        setDetail(detail);
        setStatus(status);
        this.title = title;
        this.detail = detail;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }


}
