package com.booleanuk.core;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TodoItem {
    private String title;
    private String detail;
    private String status;

}