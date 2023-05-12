package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    public void testGetStatus(){
        TodoItem item = new TodoItem("Go to the doctor","Go for my annual appointment","Not done");
        Assertions.assertEquals(item.getStatus(),"Not done"); // the get status works
    }
    @Test
    public void testGetTitle(){
        TodoItem item = new TodoItem("Go to the doctor","Go for my annual appointment","Not done");
        Assertions.assertEquals(item.getTitle(),"Go to the doctor"); // should fail because the function is not implemented
    }
}
