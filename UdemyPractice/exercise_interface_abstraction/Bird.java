package com.reanima.exercise_interface_abstraction;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("with wings");
    }
}
