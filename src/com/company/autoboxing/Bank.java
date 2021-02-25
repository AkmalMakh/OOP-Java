package com.company.autoboxing;


import java.util.ArrayList;

public class Bank {
  ArrayList<Branches> branches ;
  private String BankName;


  public Bank(String bank) {
    this.branches = new ArrayList<Branches>();
    this.BankName = bank;
  }

  public ArrayList<Branches> getBranches() {
    return branches;
  }

  public String getBankName() {
    return BankName;
  }

  public boolean addBranch(String newBranchName){

    if(findBranchByName(newBranchName) == null){
      this.branches.add(new Branches(newBranchName));
      return true;
    }
    return false;
  }

  public boolean addCustomer(String branchName, String customerName, double initalAmount){
    Branches branch = findBranchByName(branchName);
    if(branch != null){

      return branch.addCustomers(customerName,initalAmount);
    }
    return false;
  }

  public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
    Branches branch = findBranchByName(branchName);
    if(branch != null){
      return branch.addCustomers(customerName,transaction);
    }
    return false;
  }

  // searches customer by name and returns position
  private Branches findBranchByName(String name ){
    for (int i=0; i<branches.size(); i++){
      Branches branch = this.branches.get(i);
      if(branch.getName().equals(name)){
        return branch;
      }
    }
    return null;

  }

  public boolean listCustomers(String branchName, boolean showTransactions) {
    Branches branch = findBranchByName(branchName);
    if(branch != null){
      System.out.println("Customer Detail for branch "+ branch.getName());

      ArrayList<Customers> branchCustomers = branch.getCustomers();
      for (int i = 0; i<branchCustomers.size();i++){
        Customers branchCustomer = branchCustomers.get(i);
        System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
        if(showTransactions){
          System.out.println("Transactions: ");
          ArrayList<Double> transactions = branchCustomer.getTransaction();
          for(int j=0; j<transactions.size(); j++) {
            System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
          }
        }
      }
    return true;
  } else {
    return false;
  }
  }


}
