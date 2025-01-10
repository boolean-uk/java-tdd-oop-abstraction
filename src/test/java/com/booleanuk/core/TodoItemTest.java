package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void setStatusOnItem(){
        TodoItem todoItem = new TodoItem("Clean", "vacuum the apartment", "Not done");

        todoItem.setStatus("Done");

        Assertions.assertSame("Done", todoItem.getStatus());
    }

    @Test
    public void getStatusOnItem(){
        TodoItem todoItem = new TodoItem("Clean", "vacuum the apartment", "Not done");

        Assertions.assertSame("Not done", todoItem.getStatus());
    }
}
