package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void setGetStatusTest() {
        TodoItem todoItem = new TodoItem("Wash dishes", "Put in sink, turn on faucet, scrub", "incomplete");
        Assertions.assertEquals("Incomplete", todoItem.getStatus());
        todoItem.setStatus("Complete");
        Assertions.assertEquals("Complete", todoItem.getStatus());

    }

    @Test
    public void setGetTitleTest() {
        TodoItem todoItem = new TodoItem("Wash dishes", "Put in sink, turn on faucet, scrub", "incomplete");
        Assertions.assertEquals("Wash dishes", todoItem.getTitle());
        todoItem.setTitle("Make eggs");
        Assertions.assertEquals("Make eggs", todoItem.getTitle());

    }

    @Test
    public void setGetDetailTest() {
        TodoItem todoItem = new TodoItem("Wash dishes", "Put in sink, turn on faucet, scrub", "incomplete");
        Assertions.assertEquals("Put in sink, turn on faucet, scrub", todoItem.getDetail());
        todoItem.setDetail("Be Chicken, lay egg");
        Assertions.assertEquals("Be Chicken, lay egg", todoItem.getDetail());

    }





}
