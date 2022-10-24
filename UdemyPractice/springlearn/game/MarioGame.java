package com.reanima.spring.springlearn.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{
    public void up() {
        System.out.println("Mario jump");
    }

    public void down() {
        System.out.println("Mario sit");
    }

    public void left() {
        System.out.println("Mario move left");
    }

    public void right() {
        System.out.println("Mario move right");
    }

}
