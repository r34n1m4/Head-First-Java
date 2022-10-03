package com.reanima;

import java.util.Scanner;

public class WeekdayRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number from 0 to 6:");
        int dayNumber = scanner.nextInt();
        isWeekDay(dayNumber);

        System.out.println("Please enter month number from 1 to 12:");
        int monthNumber = scanner.nextInt();
        System.out.println(determineNameOfMonth(monthNumber));

        System.out.println("Please enter number of day from 0 to 6:");
        int dayName = scanner.nextInt();
        System.out.println(determineNameOfDay(dayName));
    }

    public static void isWeekDay(int dayNumber) {
        switch (dayNumber) {
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Weekday");
        }
    }
    //switch with return only
    private static String determineNameOfMonth(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return null;
    }
    //switch with break statement and result variable
    public static String determineNameOfDay(int dayName) {
        String result = "";
        switch (dayName) {
            case 0:
                result = "Sunday";
                break;
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
        }
        return result;
    }
}
