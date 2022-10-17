package com.reanima.generics;

import java.util.ArrayList;

public class MyCustomList<TYPE> {
    ArrayList<TYPE> list = new ArrayList<>();

    public void addElement(TYPE element) {
        list.add(element);
    }

    public void removeElement(TYPE element) {
        list.remove(element);
    }

    public String toString() {
        return list.toString();
    }

    public TYPE get(int index) {
        return list.get(index);
    }
}
