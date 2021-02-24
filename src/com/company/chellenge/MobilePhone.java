package com.company.chellenge;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts>contacts = new ArrayList<>();

    public void addContactToList(Contacts contact){

        contacts.add(contact);
    }
    public void printContactList(){
        System.out.println("You have "+ contacts.size()+" contacts in your phone");
        for(int i = 0; i<contacts.size(); i++){
            System.out.println((i+1)+". "+contacts.get(i).getName()+
                    "\n"+"phone number: "+contacts.get(i).getPhoneNumber());
        }
    }
    private void updateContacts(int position, Contacts newContact){
        System.out.println("Contact item "+(position+1)+ " has been modified");
       contacts.set(position, newContact);
    }
    public void updateContacts(Contacts name, Contacts newContact){
            int position = findContactByName(name);
            if(position >= 0){
                updateContacts(position,newContact);
            }
    }
    private void removeContact(int position){
        contacts.remove(position);
    }
    public void removeContact(Contacts name){
        int position = findContactByName(name);
        if(position >= 0){
            removeContact(position);
        }
    }

    private int findContactByName(Contacts contact){
        return contacts.indexOf(contact);
    }
    private int findContactByName(String name){
        for(int i=0; i<contacts.size(); i++){
            Contacts contact = contacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }

        return -1;
    }


    public Contacts queryContact(String name) {
        int position = findContactByName(name);
        if(position >=0) {
            return contacts.get(position);
        }

        return null;
    }

}
