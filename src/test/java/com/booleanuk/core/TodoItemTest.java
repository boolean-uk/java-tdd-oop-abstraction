package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    TodoItem todo;
    @BeforeEach
    public void setUp(){
        todo = new TodoItem("Task 1","Clean the kitchen");
    }
    @Test
    public void testChangingStatus(){
        todo.completeTask();
        Assertions.assertTrue(todo.isCompleted());
        todo.continueWithTask();
        Assertions.assertFalse(todo.isCompleted());
    }

}
