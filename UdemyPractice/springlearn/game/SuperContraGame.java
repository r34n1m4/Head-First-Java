package com.reanima.spring.springlearn.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole{
    public void up() {
        System.out.println("SuperContraGame jump");
    }

    public void down() {
        System.out.println("SuperContraGame sit");
    }

    public void left() {
        System.out.println("SuperContraGame move left");
    }

    public void right() {
        System.out.println("SuperContraGame move right");
    }

}
