package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    public void testStatus(){
        TodoItem item = new TodoItem("Go to the doctor","Go for my annual appointment","Not done");
        Assertions.assertEquals(item.getStatus(),"Not done"); // the get status works
        item.setStatus("Done");
        Assertions.assertEquals("Done",item.getStatus());
    }
    @Test
    public void testTitle(){
        TodoItem item = new TodoItem("Go to the doctor","Go for my annual appointment","Not done");
        TodoItem item2 = new TodoItem("Go to the gym","Like any other day","Not done");
        Assertions.assertEquals(item.getTitle(),"Go to the doctor"); // should fail because the function is not implemented
        Assertions.assertEquals(item2.getTitle(),"Go to the gym");
        item.setTitle("New title");
        Assertions.assertEquals(item.getTitle(),"New title");
    }
    @Test
    public void testDetail(){
    TodoItem item = new TodoItem("Go to the doctor","Go for my annual appointment","Not done");
    Assertions.assertEquals("Go for my annual appointment",item.getDetail());
    item.setDetail("My bi-annual appointment");
    Assertions.assertEquals("My bi-annual appointment",item.getDetail());
    }
}
