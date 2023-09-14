package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    public void shouldHaveTitle(){
        TodoItem tdi = new TodoItem("Walk Dog", "Take Ralf out in the afternoon.");
        Assertions.assertEquals("Walk Dog", tdi.getTitle());
    }

    @Test
    public void titleShouldChange(){
        TodoItem tdi = new TodoItem("Walk Dog", "Take Ralf out in the afternoon.");
        tdi.setTitle("Walk Family Dog");
        Assertions.assertEquals("Walk Family Dog", tdi.getTitle());
    }

    @Test
    public void shouldHaveDetails(){
        TodoItem tdi = new TodoItem("Walk Dog", "Take Ralf out in the afternoon.");
        Assertions.assertEquals("Take Ralf out in the afternoon.", tdi.getDetail());
    }

    @Test
    public void detailsShouldChange(){
        TodoItem tdi = new TodoItem("Walk Dog", "Take Ralf out in the afternoon.");
        tdi.setDetail("Take Ralf out in the evening.");
        Assertions.assertEquals("Take Ralf out in the evening.", tdi.getDetail());
    }

    @Test
    public void shouldStartAsPending(){
        TodoItem tdi = new TodoItem("Walk Dog", "Take Ralf out in the afternoon.");
        Assertions.assertEquals("Pending", tdi.getStatus());
    }

    @Test
    public void shouldChangeStatusToDone(){
        TodoItem tdi = new TodoItem("Walk Dog", "Take Ralf out in the afternoon.");
        tdi.setStatus();
        Assertions.assertEquals("Done", tdi.getStatus());
    }

    @Test
    public void shouldCycleBackToPendingIfActuallyNotDone() {
        TodoItem tdi = new TodoItem("Walk Dog", "Take Ralf out in the afternoon.");
        Assertions.assertEquals("Pending", tdi.getStatus());
        tdi.setStatus();
        Assertions.assertEquals("Done", tdi.getStatus());
        tdi.setStatus();
        Assertions.assertEquals("Pending", tdi.getStatus());
    }
}
