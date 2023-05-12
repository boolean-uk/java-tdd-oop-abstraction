package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void testGetTitle(){
        TodoItem todoItem = new TodoItem("Practice abstraction", "Master that skill", "incomplete");
        Assertions.assertEquals("Practice abstraction", todoItem.getTitle());
    }

    @Test
    public void testSetTitle(){
        TodoItem todoItem = new TodoItem("Practice abstraction", "Master that skill", "incomplete");
        todoItem.setTitle("Practice encapsulation");
        Assertions.assertEquals("Practice encapsulation", todoItem.getTitle());
    }

    @Test
    public void testGetDetail(){
        TodoItem todoItem = new TodoItem("Practice abstraction", "Master that skill", "incomplete");
        Assertions.assertEquals("Master that skill", todoItem.getDetail());
    }

    @Test
    public void testSetDetail(){
        TodoItem todoItem = new TodoItem("Practice abstraction", "Master that skill", "incomplete");
        todoItem.setDetail("Revise exercise");
        Assertions.assertEquals("Revise exercise", todoItem.getDetail());
    }


}
