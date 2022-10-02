package com.reanima;

public class MyCharRunner {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('b');
        System.out.println("Is vowel? " + myChar.isVowel());
        System.out.println("Is digit? " + myChar.isDigit());
        System.out.println("Is alphabet character? " + myChar.isAlphabet());
        System.out.println("Is consonant? " + myChar.isConsonant());
        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();

    }
}
