package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> GroceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        GroceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + GroceryList.size() + " items in you grocery list");
        for (int i = 0; i < GroceryList.size(); i++) {
            System.out.println((i + 1) + ". " + GroceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        GroceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        GroceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return GroceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >=0) {
            return true;
        }
        return false;
    }
}
