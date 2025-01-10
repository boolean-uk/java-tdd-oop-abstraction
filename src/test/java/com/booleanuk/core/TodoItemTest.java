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

    @Test
    public void setTitleOnItem(){
        TodoItem todoItem = new TodoItem("Clean", "vacuum the apartment", "Not done");

        todoItem.setTitle("Wash");

        Assertions.assertSame("Wash", todoItem.getTitle());
    }

    @Test
    public void getTitleOnItem(){
        TodoItem todoItem = new TodoItem("Run", "vacuum the apartment", "Not done");

        Assertions.assertSame("Run", todoItem.getTitle());
    }

    @Test
    public void setDetailOnItem(){
        TodoItem todoItem = new TodoItem("Clean", "vacuum the apartment", "Not done");

        todoItem.setTitle("Clean the kitchen");

        Assertions.assertSame("Clean the kitchen", todoItem.getDetail());
    }

    @Test
    public void getDetailOnItem(){
        TodoItem todoItem = new TodoItem("Clean", "clean the floors", "Not done");

        Assertions.assertSame("clean the floors", todoItem.getDetail());
    }
}
