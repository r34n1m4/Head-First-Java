package com.reanima;

import java.util.Arrays;

public class DayOfWeekRunner {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Current array: " + Arrays.toString(days));

        String dayWithMostChar = "";
        for(String day : days) {
            if (day.length() > dayWithMostChar.length()) {
                dayWithMostChar = day;
            }
        }

        System.out.println("Day with most characters is: " + dayWithMostChar);

        System.out.print("Array backwards: ");
        for (int i = days.length - 1; i >= 0; i--) {
            System.out.print(days[i] + " ");
        }

    }
}
