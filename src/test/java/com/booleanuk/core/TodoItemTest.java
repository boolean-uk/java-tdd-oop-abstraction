package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void gettersTest(){
        TodoItem todoItem = new TodoItem("New item","Detailed description","Finished");
        Assertions.assertEquals("New item", todoItem.getTitle());
        Assertions.assertEquals("Detailed description", todoItem.getDetail());
        Assertions.assertEquals("Finished", todoItem.getStatus());
    }

    @Test
    public void settersTest(){
        TodoItem todoItem = new TodoItem("New item","Detailed description","Finished");
        todoItem.setTitle("Go shopping");
        todoItem.setDetail("Buy bread");
        todoItem.setStatus("To do");
        Assertions.assertEquals("Go shopping", todoItem.getTitle());
        Assertions.assertEquals("Buy bread", todoItem.getDetail());
        Assertions.assertEquals("To do", todoItem.getStatus());
    }

}
