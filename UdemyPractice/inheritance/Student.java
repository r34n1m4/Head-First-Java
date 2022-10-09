package com.reanima.inheritance;

public class Student extends Person {
    private String college;
    private String group;

    public Student (String name, String college) {
        super(name);
        this.college = college;
    }
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
