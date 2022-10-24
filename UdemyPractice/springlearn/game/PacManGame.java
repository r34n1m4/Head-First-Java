package com.reanima.spring.springlearn.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{
    public void up() {
        System.out.println("PacMan move up");
    }

    public void down() {
        System.out.println("PacMan move down");
    }

    public void left() {
        System.out.println("PacMan move left");
    }

    public void right() {
        System.out.println("PacMan move right");
    }
}
