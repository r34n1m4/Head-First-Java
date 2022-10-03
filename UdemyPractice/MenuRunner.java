package com.reanima;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("The number you entered is: " + number1);

        System.out.print("Enter Number 2: ");
        int number2 = scanner.nextInt();
        System.out.println("The number you entered is: " + number2);

        System.out.println("Menu:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");

        System.out.print("Choose operation: ");
        int operation = scanner.nextInt();
        System.out.println("The operation you chosen is: " + operation);


        getResultWithElseIf(number1, number2,operation);
        getResultWithSwitch(number1, number2, operation);

    }
    //nested if-else
    private static void getResultWithElseIf(int number1, int number2, int operation) {
        if (operation == 1) {
            System.out.println(number1 + number2);
        } else if (operation == 2) {
            System.out.println(number1 - number2);
        } else if (operation == 3) {
            System.out.println(number1 / number2);
        } else if (operation == 4) {
            System.out.println(number1 * number2);
        } else {
            System.out.println("Incorrect operation choice!");
        }
    }

    //switch
    private static void getResultWithSwitch(int number1, int number2, int operation) {
        switch(operation) {
            case 1 :
                System.out.println(number1 + number2);
                break;
            case 2 :
                System.out.println(number1 - number2);
                break;
            case 3 :
                System.out.println(number1 / number2);
                break;
            case 4 :
                System.out.println(number1 * number2);
                break;
            default:
                System.out.println("Incorrect operation choice!");
        }
    }
}
