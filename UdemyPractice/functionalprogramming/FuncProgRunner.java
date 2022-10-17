package com.reanima.functionalprogramming;

import java.util.List;

public class FuncProgRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
        printBasic(list);
        printWithFP(list);
        }

        private static void printBasic(List<String> list) {
            for (String string : list) {
                System.out.println(string);
            }
        }
        //lambda expression
        private static void printWithFP(List<String> list) {
        list.stream().forEach(element -> System.out.println(element) );
        }
}

