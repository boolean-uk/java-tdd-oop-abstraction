package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {


    @Test
    public void changeTitleTest()
    {
        TodoItem todoItem = new TodoItem("title1","detail1","status1");
        String title2="title2";
        todoItem.setTitle(title2);
        Assertions.assertEquals(title2,todoItem.getTitle());
    }
    @Test
    public void changeDetailTest()
    {
        TodoItem todoItem = new TodoItem("title1","detail1","status1");
        String detail2="detail2";
        todoItem.setDetail(detail2);
        Assertions.assertEquals(detail2,todoItem.getDetail());
    }
    @Test
    public void changeStatusTest()
    {
        TodoItem todoItem = new TodoItem("title1","detail1","status1");
        String status2="status2";
        todoItem.setStatus(status2);
        Assertions.assertEquals(status2,todoItem.getStatus());
    }

}
