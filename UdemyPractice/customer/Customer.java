package com.reanima.customer;

public class Customer {
    //state
    private String name;
    private Address homeAddress;
    private Address workAddress;

    //constructor
    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    //operations
    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }
    //print
    public String toString() {
        return String.format("Name: %s, Home Address: %s, WorkAddress: %s",
                name, homeAddress, workAddress);
    }
}
