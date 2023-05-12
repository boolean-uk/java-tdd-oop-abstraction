package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    TodoItem todoItem;

    @BeforeEach
    public void setup(){
        todoItem  = new TodoItem("Item1", "Detail1", "Status1");
    }
    @Test
    public void testTitleProperty(){

        Assertions.assertEquals("Item1", todoItem.getTitle());
        todoItem.setTitle("New Item1");
        Assertions.assertEquals("New Item1",todoItem.getTitle());

    }
    @Test
    public void testDetailProperty(){

        Assertions.assertEquals("Detail1", todoItem.getDetail());
        todoItem.setDetail("New Detail1");
        Assertions.assertEquals("New Detail1",todoItem.getDetail());

    }
    @Test
    public void testStatusProperty(){

        Assertions.assertEquals("Status1", todoItem.getStatus());
        todoItem.setStatus("New Status1");
        Assertions.assertEquals("New Status1",todoItem.getStatus());

    }

}
