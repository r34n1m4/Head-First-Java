package com.reanima.inheritance;

public class Employee extends Person {
    private String title;
    private String employer;
    private String employeeGrade;
    private int salary;

    public Employee(String name, String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString() {
        return super.toString() + String.format("Title: %s, Employer: %s, Employee Grade: %s, Salary: %d",
                title, employer, employeeGrade, salary);
    }
}
