package com.booleanuk.core;

public class TrafficLight {
    private String colour;
    public TrafficLight() {
        this.colour = "green";
    }

    public boolean canGo() {
        return this.colour.equals("green");
    }

    public void setGreen() {
        this.colour = "green";
    }

    public void setRed() {
        this.colour = "red";
    }
}