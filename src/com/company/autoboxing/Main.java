package com.company.autoboxing;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private static ArrayList<Bank> bank= new ArrayList<Bank>();
    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1: //prints all banks
                    for(int i =0;i< bank.size(); i++){
                        System.out.println(i+1+") "+bank.get(i).getBankName());
                    }
                    break;
                case 2:
                    System.out.println("Enter Bank name: ");
                    String BankName = scanner.nextLine();
                    ArrayList<Branches> bran = new ArrayList<>();
                    for(int i =0;i< bank.size(); i++){
                        if(bank.get(i).getBankName().equals(BankName)){
                             bran = bank.get(i).getBranches();
                        }
                    }
                    for (int i =0 ; i<bran.size(); i++){
                        System.out.println("Branch name: "+bran.get(i).getName()
                                );
                    }
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Enter Bank name: ");
                    String Bankname = scanner.nextLine();
                    bank.add(new Bank(Bankname));
                    break;
                case 5:
                    System.out.println("Enter Bank name: ");
                    String Banknam = scanner.nextLine();
                    System.out.println("Enter Branch name: ");
                    String BranchName = scanner.nextLine();

                    for(int i=0;i<bank.size();i++){
                        if(bank.get(i).getBankName().equals(Banknam)){
                            bank.get(i).addBranch(BranchName);
                        }
                        else {
                            System.out.println("Bank did not found");
                        }
                    }

                    break;
                case 6:
                    System.out.println("Enter Bank name: ");
                    String Bankna = scanner.nextLine();
                    System.out.println("Enter Branch name: ");
                    String BranchNa = scanner.nextLine();
                    System.out.println("Enter Customer name: ");
                    String CustomerName = scanner.nextLine();
                    System.out.println("Enter initial transaction : ");
                    double trans = scanner.nextDouble();
                    for(int i=0;i<bank.size();i++){
                        if(bank.get(i).getBankName().equals(Bankna)){
                            bank.get(i).addCustomer(BranchNa,CustomerName,trans);
                        }
                    }

                    break;
                case 7:
                    System.out.println("Enter Bank name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Branch name: ");
                    String Name = scanner.nextLine();
                    System.out.println("Enter Customer name: ");
                    String CustomName = scanner.nextLine();
                    System.out.println("Enter transaction amount: ");
                    double transc = scanner.nextDouble();
                    for(int i=0;i<bank.size();i++){
                        if(bank.get(i).getBankName().equals(name)){
                            bank.get(i).addCustomerTransaction(Name,CustomName,transc);
                        }
                    }

                    break;
                case 8:
                    quit = true;
                    break;

            }
        }

    }
    public static void printInstructions() {
        System.out.println("\n Press 0-6");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of Banks.");
        System.out.println("\t 2 - To print the list of Branches of that bank.");
        System.out.println("\t 3 - To print the list of Customers of that branch.");
        System.out.println("\t 4 - To add a Bank.");
        System.out.println("\t 5 - To add a branch for Bank.");
        System.out.println("\t 6 - To add a customer in the branch.");
        System.out.println("\t 7 - To add a transaction for customer of that branch.");
        System.out.println("\t 8 - To quit the application.");
    }



}
