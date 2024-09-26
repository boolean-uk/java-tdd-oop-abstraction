package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void testChangeToComplete(){
        TodoItem newTodoItem = new TodoItem("Do my laundry", "Do not use too much soap");
        Assertions.assertEquals("complete", newTodoItem.changeToComplete());


    }

    @Test
    public void testIsComplete(){
        TodoItem newTodoItem = new TodoItem("Do my laundry", "Do not use too much soap");
        Assertions.assertFalse(newTodoItem.isComplete());

        newTodoItem.changeToComplete();
        Assertions.assertTrue(newTodoItem.isComplete());
    }






}
