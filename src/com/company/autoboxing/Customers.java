package com.company.autoboxing;

import java.util.ArrayList;

public class Customers {
    private String Name;
    private ArrayList<Double> transaction;

    public Customers(String name,Double initialAmount) {
        Name = name;
        this.transaction = new ArrayList<Double>();
        this.transaction.add(initialAmount);
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public void setTransaction(Double transaction) {
        this.transaction.add(transaction);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
