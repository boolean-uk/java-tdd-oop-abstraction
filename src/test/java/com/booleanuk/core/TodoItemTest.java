package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    public void testGetTitle(){
        TodoItem item = new TodoItem("Bread","Whole wheat","Fresh");
        Assertions.assertEquals("Bread", item.getTitle());

    }

    @Test
    public void testGetDetail(){
        TodoItem item = new TodoItem("Bread","Whole wheat","Fresh");
        Assertions.assertEquals("Whole wheat", item.getDetail());
    }

    @Test
    public void testGetStatus(){
        TodoItem item = new TodoItem("Bread","Whole wheat","Fresh");
        Assertions.assertEquals("Fresh", item.getStatus());
    }

    @Test
    public void testSetTitle(){
        TodoItem item = new TodoItem("Bread","Whole wheat","Fresh");
        item.setTitle("Coffee");
        Assertions.assertEquals("Coffee", item.getTitle());

    }



}
