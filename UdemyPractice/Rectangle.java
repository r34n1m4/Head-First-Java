package com.reanima;

public class Rectangle {
    //mandatory on creation
    private int length;
    private int width;
    //non-mandatory on creation
    private int rectangleArea;
    private int perimeter;
    private boolean isSquare;

    //constructor
    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //area
    public int rectangleArea() {
        return length * width;
    }
    //perimeter
    public int rectanglePerimeter() {
        return 2 * (length + width);
    }
    //is square?
    public void isSquare() {
        if (length == width) {
            isSquare = true;
        }
    }
    //print state
    public String toString() {
        return String.format("Length: %d, Width: %d, Area: %d, Perimeter: %d Is square? %b",
                length, width, rectangleArea(), rectanglePerimeter(), isSquare);
    }
}
