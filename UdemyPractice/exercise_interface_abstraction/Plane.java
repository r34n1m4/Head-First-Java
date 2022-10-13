package com.reanima.exercise_interface_abstraction;

public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("with fuel");
    }
}
