package com.reanima.collections;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
        //unique - Set:
        //Tree, Hash, LinkedHash
        Set<Character> treeSet = new TreeSet<>(characters);
        Set<Character> hashSet = new HashSet<>(characters);
        Set<Character> linkedHash = new LinkedHashSet<>(characters);
        //sorted by asc
        System.out.println("Tree set: " + treeSet);
        //unsorted
        System.out.println("Hash set: " + hashSet);
        //sorted by insert
        System.out.println("Linked Hash set: " + linkedHash);
    }
}
