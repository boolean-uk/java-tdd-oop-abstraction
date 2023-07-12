package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    private TodoItem todoItem;

    @BeforeEach
    public void setUp() {
        todoItem = new TodoItem("Clean room", "with cleaning window", "unDone");
    }

    @Test
    public void shouldSetStatus() {
        //Setup
        String newStatus = "done";

        //Execute
        todoItem.setStatus(newStatus);

        //Verify
        Assertions.assertEquals(newStatus, todoItem.getStatus());
    }

    @Test
    public void shouldGetStatus() {
        Assertions.assertEquals("unDone", todoItem.getStatus());
    }

    @Test
    public void shouldGetTitle() {
        Assertions.assertEquals("Clean room", todoItem.getTitle());
    }

    @Test
    public void shouldSetTitle() {
        //Setup
        String newTitle = "New Title";

        //Execute
        todoItem.setTitle(newTitle);

        //Verify
        Assertions.assertEquals(newTitle, todoItem.getTitle());
    }

    @Test
    public void shouldGetDetail() {
        Assertions.assertEquals("with cleaning window", todoItem.getDetail());
    }

    @Test
    public void shouldSetDetail() {
        //Setup
        String newDetail = "new detail";

        //Execute
        todoItem.setDetail(newDetail);

        //Verify
        Assertions.assertEquals(newDetail, todoItem.getDetail());
    }
}
