package com.reanima.customer;

public class Address {
    private String line1;
    private String city;
    private String zip;

    //constructor
    public Address(String line1, String city, String zip) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {
        return String.format("Street: %s, City: %s, ZIP: %s", line1, city, zip);
    }

}
