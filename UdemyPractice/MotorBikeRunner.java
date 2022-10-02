package com.reanima;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        ducati.increaseSpeed(100);
        ducati.decreaseSpeed(50);
        System.out.println(ducati.getSpeed());

        //honda.setSpeed(90);
        //System.out.println(honda.getSpeed());
    }
}
