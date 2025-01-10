package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    // Status
    @Test
    public void statusIsUpdated(){
        TodoItem todoItem = new TodoItem("Clean room", "Vacuum the livingroom", "Incomplete");
        String status = "completed";
        todoItem.setStatus(status);

        Assertions.assertEquals(status, todoItem.getStatus());
    }

    @Test
    public void correctStatusIsRecieved(){
        TodoItem todoItem = new TodoItem("Clean room", "Vacuum the livingroom", "Incomplete");

        Assertions.assertEquals("Incomplete", todoItem.getStatus());
    }


    // Detail
    @Test
    public void detailIsChanged(){
        TodoItem todoItem = new TodoItem("Clean room", "Vacuum the livingroom", "Incomplete");
        String detail = "Clean the toilet";
        todoItem.setDetail(detail);

        Assertions.assertEquals(detail, todoItem.getDetail());
    }

    @Test
    public void correctDetailIsRecieved(){
        TodoItem todoItem = new TodoItem("Clean room", "Vacuum the livingroom", "Incomplete");

        Assertions.assertEquals("Vacuum the livingroom", todoItem.getDetail());
    }


    // Title
    @Test
    public void titleIsChanged(){
        TodoItem todoItem = new TodoItem("Clean room", "Vacuum the livingroom", "Incomplete");
        String title = "Clean livingroom";
        todoItem.setTitle(title);

        Assertions.assertEquals(title, todoItem.getTitle());
    }

    @Test
    public void correctTitleIsRecieved(){
        TodoItem todoItem = new TodoItem("Clean room", "Vacuum the livingroom", "Incomplete");

        Assertions.assertEquals("Clean room", todoItem.getTitle());
    }




}
