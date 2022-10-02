package com.reanima;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book(20);
        Book effectiveJava = new Book(20);
        Book cleanCode = new Book(20);

        /*
        artOfComputerProgramming.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(75);
        cleanCode.setNoOfCopies(50);
         */

        artOfComputerProgramming.increaseNOC(50);//150 or 70
        effectiveJava.decreaseNOC(25);//50 or 20
        cleanCode.increaseNOC(25);//75 or 45
        cleanCode.decreaseNOC(25);//50 or 20

        System.out.println(artOfComputerProgramming.getNoOfCopies());
        System.out.println(effectiveJava.getNoOfCopies());
        System.out.println(cleanCode.getNoOfCopies());

    }
}
