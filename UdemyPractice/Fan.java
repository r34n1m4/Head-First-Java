package com.reanima;

public class Fan {
    //state
    //mandatory on creation
    private final String make;
    private final double radius;
    private final String color;
    //not mandatory on creation
    private boolean isOn;
    private byte speed; //0 to 5

    //creation - constructors
    public Fan (String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }
    //isOn
    public void switchOn() {
        this.isOn = true;
        setSpeed((byte)5);
    }

    public void switchOff() {
        this.isOn = false;
        setSpeed((byte)0);
    }
    //speed
    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    //print the state
    public String toString() {
        return String.format("make - %s, radius - %f, color - %s, isOn - %b,speed - %d",
                        make, radius, color, isOn, speed);
    }

}
