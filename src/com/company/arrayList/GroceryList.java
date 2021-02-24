package com.company.arrayList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);

    }
    public void printGroceryList(){
        System.out.println("You have "+ groceryList.size()+ " items in your grocery list");
        for(int i= 0; i< groceryList.size(); i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }
    private void updateGrocery(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+(position+1)+ " has been modified");
    }
    public void updateGrocery(String currentItem ,String newItem){
        int postion = findItem(currentItem);
        if(postion>= 0) {
            updateGrocery(postion,newItem);
        }
    }
    private void removeGroceryItem(int position){
        groceryList.remove(position);

    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position>= 0) {
            removeGroceryItem(position);
        }
    }
    private int findItem(String searchItem){
       return groceryList.indexOf(searchItem);
    }
    public boolean onFile(String SearchItem){
        int postion = findItem(SearchItem);
        if(postion>=0){
            return true;
        }
        return false;

    }
}
