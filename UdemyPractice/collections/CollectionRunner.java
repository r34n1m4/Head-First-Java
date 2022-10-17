package com.reanima.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionRunner {
    static List<String> list = List.of("Apple", "Badger");
    static List<String> listAL = new ArrayList<>(list);
    static List<Integer> listNumbers = List.of(100, 110, 111, 112);

    public static void main(String[] args) {
            //enhanced loop for list elements
            for (String s : list) {
                System.out.println(s);
            }
            //listAl output by index
            System.out.println(listAL);
            System.out.println(listAL.indexOf("Apple"));
            //Collections.sort
        Collections.sort(listNumbers);
        //use of Iterator
        Iterator<String> list1Iterator = list.iterator();
            while (list1Iterator.hasNext()) {
                System.out.println(list1Iterator.next());
            }
    }
}
