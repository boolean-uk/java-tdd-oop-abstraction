package com.booleanuk.core;

public class TodoItem {
    private String title;
    private String detail;
    private String status;

    public void setStatusComplete() {
        this.status = "Complete";
    }
    public void setStatusIncomplete() {
        this.status = "Incomplete";
    }

    public String getStatus() {
        return this.status;
    }

    public String getTitle() {
        return title;
    }

    public boolean setTitle(String title) {
        if (title.isEmpty()) {
            return false;
        }
        this.title = title;
        return true;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
