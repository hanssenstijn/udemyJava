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

    public void modifyGroceryItem(int position, String newItem) {
        GroceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(int position) {
        String theItem = GroceryList.get(position);
        GroceryList.remove(position);
    }

    public String findItem(String searchItem) {
        // boolean exists = com.company.GroceryList.contains(searchItem);
        int position = GroceryList.indexOf(searchItem);
        if (position >= 0) {
            return GroceryList.get(position);
        }

        return null;
    }
}
