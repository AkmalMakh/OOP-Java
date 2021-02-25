package com.company.linkedList;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Aki", 54.98);
        Customer anotherCustomer;

        anotherCustomer = customer;
        anotherCustomer.setBalance(12.32);
        System.out.println("Balance for Customer " + customer.getName()+ " is "+customer.getBalance());
    }
}
