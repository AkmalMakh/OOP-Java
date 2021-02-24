package com.company.chellenge;

import java.util.Scanner;

public class ArrayChallenge {
    private static Scanner scanner= new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {

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
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                   // searchItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }

        }
    public static void printInstructions() {
        System.out.println("\n Press 0-6");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the contacts.");
        System.out.println("\t 3 - To modify a contact in the contacts.");
        System.out.println("\t 4 - To remove a contact in the contact list.");
        System.out.println("\t 5 - To search for a contact in the contact list.");
        System.out.println("\t 6 - To quit the application.");
    }
    public static void addItem(){

        System.out.println("Enter new contact name : ");
        String newItem = scanner.nextLine();
        System.out.println("Enter new contact phone number : ");
        String newItemPhone = scanner.nextLine();
        mobilePhone.addContactToList(new Contacts(newItem,newItemPhone));
    }
    public  static void modifyItem(){
        System.out.println("Enter the Current contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Name is not found ");
            return;
        }
        System.out.println("Enter new contact name : ");
        String newItem = scanner.nextLine();
        System.out.println("Enter new contact phone number : ");
        String newItemPhone = scanner.nextLine();

        mobilePhone.updateContacts(existingContactRecord,new Contacts(newItem,newItemPhone));
    }
    public static void removeItem(){
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Name is not found ");
            return;
        }
        mobilePhone.removeContact(existingContactRecord);
    }

}
