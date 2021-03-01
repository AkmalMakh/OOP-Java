package com.company.InterfaceChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Player akmal = new Player("Aki", 10,15);
        System.out.println(akmal.toString());
        saveObject(akmal);

        akmal.setHitPoints(8);
        System.out.println(akmal);
        akmal.setWeapon("Stormbringer");
        saveObject(akmal);
//        loadObject(akmal);
//        System.out.println(akmal);

        ISaveable werewolf = new Monster("Werewolf", 10,30);
        System.out.println(werewolf);
        saveObject(werewolf);
    }
    public static ArrayList<String > readValues(){
        ArrayList<String >values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit =  false;
        int index = 0;
        System.out.println("Choose\n"
                +"1 to enter a string"
                +"0 to quit");
        while (!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    public static void saveObject(ISaveable objectToSav){
        for(int i= 0;i< objectToSav.write().size();i++) {
            System.out.println("Saving "+objectToSav.write().get(i)+ " to storage device");
        }

    }
    public static void loadObject(ISaveable objectToLoadd){
        ArrayList<String > values = readValues();
        objectToLoadd.read(values);
    }
}
