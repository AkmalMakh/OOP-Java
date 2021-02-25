package com.company.autoboxing;

import java.util.ArrayList;

public class Branches {
    private String name;
    ArrayList<Customers> customers ;

    public Branches(String name) {
        this.name = name;
        this.customers =  new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customers> getCustomers() {
        return customers;
    }

    public boolean addCustomers(String customerName, double initialAmount){
        if(findCustomerByName(customerName) == null){
            customers.add(new Customers(customerName,initialAmount));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String name, double NewTransaction){
        Customers customer = findCustomerByName(name);
        if(customer == null) {
            System.out.println("Customer is not found!!!");
            return false;
        }
        else {
            customer.setTransaction(NewTransaction);
            return true;
        }
    }



    // searches customer by name and returns position
    private Customers findCustomerByName(String name ){
        for (int i=0; i<customers.size(); i++){
            Customers customer = customers.get(i);
            if(customer.getName().equals(name)){
                return customer;
            }
        }
        return null;

    }
}
