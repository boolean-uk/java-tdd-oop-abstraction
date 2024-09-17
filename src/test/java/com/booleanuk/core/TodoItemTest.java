package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void setStatusTest(){
        TodoItem todo = new TodoItem("This is title", "This is detail", "This is status");
        todo.setTitle("New title");
        todo.setDetail("New detail");
        todo.setStatus("New status");
        todo.getTitle();
        todo.getDetail();
        todo.getStatus();
    }

}
