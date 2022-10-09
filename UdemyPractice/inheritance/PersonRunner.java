package com.reanima.inheritance;

public class PersonRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("employee", "title");
        System.out.println(employee);
        Employee test = new Employee("testName", "testTitle");
        //test.setName("Test");
        test.setPhone("1234567890");
        test.setEmail("test@gmail.com");
        test.setTitle("Mr");
        test.setEmployer("Test SIA");
        test.setEmployeeGrade("AAA");
        test.setSalary(100500);
        System.out.println(test);
    }
}
