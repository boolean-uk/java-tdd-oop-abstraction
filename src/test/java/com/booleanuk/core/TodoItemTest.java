package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {

    @Test
    public void taskChangeIsCompletedShouldBeTrue()  {
        TodoItem todoItem = new TodoItem("title","detail");

        // Execute
        todoItem.changeIsCompleted();

        // Verify
        Assertions.assertTrue(todoItem.getIsCompleted());
    }


}
