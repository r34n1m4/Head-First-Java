package com.reanima.inheritance;

public class Person {
    private String name;
    private String phone;
    private String email;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
    return String.format("Name: %s, Phone: %s, Email: %s", name, phone, email);
    }
}
