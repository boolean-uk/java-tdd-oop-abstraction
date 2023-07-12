package com.booleanuk.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TodoItem {
    private final String title;
    private final String detail;
    private Status status;

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
