package CodeMagnets;

import java.util.*;

public class CodeMagnetP191 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        //output "zero one two three"
        printAL(a);
        if (a.contains("three")) {
            a.add("four");
        }
        a.remove(2);

        //output "zero one three four"
        printAL(a);
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }

        //output "zero one three four 4.2"
        printAL(a);
        if (a.contains("two")) {
            a.add("2.2");
        }

        //output "zero one three four 4.2"
        printAL(a);
    }
    public static void printAL (ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
