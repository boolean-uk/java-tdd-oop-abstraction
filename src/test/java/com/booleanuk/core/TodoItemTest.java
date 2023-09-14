package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    public void testAbstraction(){
        TodoItem todo = new TodoItem("Wash the clothes", "seperate colours","not completed");
        todo.setTitle("clean the floor");
        todo.setDetail("attention to the corners");
        todo.setStatus("completed");
        Assertions.assertEquals(todo.getTitle(),"clean the floor");
        Assertions.assertEquals(todo.getDetail(),"attention to the corners");
        Assertions.assertEquals(todo.getStatus(),"completed");
    }

}
