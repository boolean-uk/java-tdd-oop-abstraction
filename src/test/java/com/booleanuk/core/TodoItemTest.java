package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    void setStatus(){
        TodoItem todoItem=new TodoItem("whatever","wherever","in progress");
        String status=todoItem.getStatus();
        todoItem.setStatus("done");
        Assertions.assertEquals(status,todoItem.getStatus());
    }
    @Test
    void getStatus(){
        TodoItem todoItem=new TodoItem("whatever","wherever","in progress");
        String status="in progress";

        Assertions.assertEquals(status,todoItem.getStatus());
    }

}
