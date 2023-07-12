package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void testChangeStatus(){
        TodoItem todo = new TodoItem("Do homework", "Details");
        todo.changeStatus();
        Assertions.assertTrue(todo.getStatus());
    }

    @Test
    public void testTitle(){
        TodoItem todo = new TodoItem("Do homework", "Details");
        todo.changeTitle("Wash dishes");
        Assertions.assertEquals("Wash dishes", todo.getTitle());
    }
    @Test
    public void testDetails(){
        TodoItem todo = new TodoItem("Do homework", "Details");
        todo.changeDetails("new Details");
        Assertions.assertEquals("new Details", todo.getDetails());
    }

}
