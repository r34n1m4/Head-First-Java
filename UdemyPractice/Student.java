package com.reanima;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    private String name;
    private int[] marks;

    //using variable argument
    public Student(String name, int... marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks() {
        return marks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int value : marks) {
            sum += value;
        }
        return sum;
    }

    public int getMaximumMark() {
        int max = 0;
        for(int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        return max;
    }

    public int getMinimumMark() {
        int min = marks[0];
        for(int i = 0; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        return min;
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }
}
