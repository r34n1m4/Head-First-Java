package com.reanima;

import java.util.Scanner;

public class MyNumberRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt();

        MyNumber number = new MyNumber(n);
        boolean isPrime = number.isPrime();
        System.out.println("Is prime? " + isPrime);

        System.out.println("Sum of numbers: " + number.sumUptoN());
        System.out.println("Sum of divisors: " + number.sumOfDivisors());
        number.numberTriangle();
        System.out.println("Squares to limit:");
        number.squaresOfNumber();
        System.out.println();
        System.out.println("Cubes to limit:");
        number.cubesOfNumber();
        System.out.println();
        number.userCubes();
    }
}
