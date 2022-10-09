package com.reanima;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Default Manufacturer", 0.34, "white");
        fan.switchOn();
        fan.setSpeed((byte)3);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
