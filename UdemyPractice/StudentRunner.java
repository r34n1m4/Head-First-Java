package com.reanima;

import java.math.BigDecimal;
import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args) {
        int[] marks = {98, 99, 100};
        Student student = new Student ("John",marks);

        //methods
        int number = student.getNumberOfMarks();
        System.out.println("Number of marks: " + number);
        int sum = student.getTotalSumOfMarks();
        System.out.println("Summary of marks: " + sum);
        int max = student.getMaximumMark();
        System.out.println("Maximum mark is: " + max);
        int min = student.getMinimumMark();
        System.out.println("Minimum mark is: " + min);
        BigDecimal avg = student.getAverageMarks();
        System.out.println("Average mark is: " + avg);

        System.out.println(student);

        student.addNewMark(35);
        System.out.println(student);

        student.removeMarkAtIndex(3);
        System.out.println(student);
    }
}
