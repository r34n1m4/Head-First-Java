package com.reanima.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        //threads: 3
        list.add("Apple");
        list.add("Bat");
        list.add("Cat");

        //threads: 10000
        for (String element : list) {
            System.out.println(element);
        }
    }
}
