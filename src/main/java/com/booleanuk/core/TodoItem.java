package com.booleanuk.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class TodoItem {
    private final String title;
    private final String detail;
    private Status status;

    public TodoItem(String title, String detail) {
        this.title = title;
        this.detail = detail;
        this.status = Status.InProgress;
    }

    public void toggleStatus() {
        status = switch (status) {
            case InProgress -> Status.Done;
            case Done -> Status.InProgress;
        };
    }

    public enum Status {
        InProgress,
        Done
    }
}
