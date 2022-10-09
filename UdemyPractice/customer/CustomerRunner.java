package com.reanima.customer;

public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("Street", "City","ZIP123");
        Customer customer = new Customer("John", homeAddress);
        Address workAddress = new Address("Work", "City", "ZIP321");
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
    }
}
