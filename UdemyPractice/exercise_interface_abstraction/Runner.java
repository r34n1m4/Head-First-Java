package com.reanima.exercise_interface_abstraction;

public class Runner {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};
        for (int i = 0; i < animals.length; i++) {
            animals[i].bark();
        }

        Flyable[] flyingObjects = {new Bird(), new Plane()};
        for (int i = 0; i < flyingObjects.length; i++) {
            flyingObjects[i].fly();
        }
    }
}
