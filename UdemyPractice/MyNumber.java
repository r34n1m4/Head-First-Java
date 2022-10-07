package com.reanima;

public class MyNumber {
    private int number;
    private int sumOfNumbers;

    public MyNumber(int number) {
        this.number = number;
        this.sumOfNumbers = sumOfNumbers;
    }

    public boolean isPrime() {

        if (number < 2 ) {
            return false;
        }
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumUptoN() {
        for (int i = 1; i <= number; i++) {
            sumOfNumbers += i;
        }
        return sumOfNumbers;
    }

    public int sumOfDivisors() {
        int sumOfDividers = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0 ) {
                sumOfDividers += i;
            }
        }
        return sumOfDividers;
    }

    public void numberTriangle() {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public void squaresOfNumber() {
        int i = 1;
        while (i * i < number) {
            System.out.print(i * i + " ");
            i++;
        }
    }

    public void cubesOfNumber() {
        int i = 1;
        while (i * i * i < number) {
            System.out.print(i * i * i + " ");
            i++;
        }
    }
}
