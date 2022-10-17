package com.reanima.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}
public class StudentCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "John"),
                new Student(100, "Jack"),
                new Student(2, "Ivan"));
        ArrayList<Student> studentsAL = new ArrayList<>(students);

        System.out.println(students);

        Collections.sort(studentsAL);
        System.out.println("Descending order: " + studentsAL);

        Collections.sort(studentsAL, new AscendingStudentComparator());
        System.out.println("Ascending order: " + studentsAL);
    }
}
