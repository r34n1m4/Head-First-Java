package com.reanima;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 6);
        System.out.println(rectangle);
        rectangle.rectangleArea();
        rectangle.rectanglePerimeter();
        rectangle.isSquare();
        System.out.println(rectangle);
        rectangle.setLength(10);
        rectangle.setWidth(12);
        System.out.println(rectangle);
    }
}
