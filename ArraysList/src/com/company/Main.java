package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("12345");
//    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.125);

        ArrayList<Integer> intArrrayList = new ArrayList<Integer>();
        for( int i=0; i<10; i++) {
            intArrrayList.add(Integer.valueOf(i));
        }

        for( int i=0; i<10; i++) {
            System.out.println(i + " --> " + intArrrayList.get(i).intValue());
        }

        Integer myIntValue = Integer.valueOf(56);
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<10.0; dbl += 0.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for(int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }










//        boolean quit = false;
//        startPhone();
//        printActions();
//        while (quit) {
//            System.out.println("\nEnter action: (6 to show available actions");
//            int action = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (action) {
//                case 0:
//                    System.out.println("\n Shutting down...");
//                    quit = true;
//                    break;
//
//                case 1:
//                    mobilePhone.printContacts();
//                    break;
//
//                case 2:
//                    addnewContact();
//                    break;
//
//                case 3:
//                    updateContact();
//                    break;
//
//                case 4:
//                    removeContact();
//                    break;
//
//                case 5:
//                    queryContact();
//                    break;
//
//                case 6:
//                    printActions();
//                    break;
//            }
//
//        }
//    }
//
//    private static void addnewContact() {
//        System.out.println("Enter new contact name: ");
//        String name = scanner.nextLine();
//        System.out.println("Ender phone number: ");
//        String phone = scanner.nextLine();
//        Contact newContact = Contact.createContact(name, phone);
//        if (mobilePhone.addNewContact(newContact)) {
//            System.out.println("New contact added: " + name + ", phone = " + phone);
//        } else {
//            System.out.println("Cannot add, " + name + " already on file");
//        }
//    }
//
//    private static void updateContact() {
//        System.out.println("Enter existing contact name: ");
//        String name = scanner.nextLine();
//        Contact existingContactRecord = mobilePhone.queryContact(name);
//        if(existingContactRecord == null) {
//            System.out.println("Contact not found.");
//            return;
//        }
//
//        System.out.println("Enter new contact name: ");
//        String newName = scanner.nextLine();
//        System.out.println("Enter new contact phone number: ");
//        String newNumber = scanner.nextLine();
//        Contact newContact = Contact.createContact(newName,newNumber);
//        if(mobilePhone.updateContact(existingContactRecord,newContact)) {
//            System.out.println("Successfully updated record");
//        } else {
//            System.out.println("Error updating recoding");
//        }
//    }
//
//    private static void removeContact() {
//        System.out.println("Enter existing contact name: ");
//        String name = scanner.nextLine();
//        Contact existingContactRecord = mobilePhone.queryContact(name);
//        if (existingContactRecord == null) {
//            System.out.println("Contact not found.");
//            return;
//        }
//        if(mobilePhone.removeContact(existingContactRecord)) {
//            System.out.println("Successfully deleted");
//        } else {
//            System.out.println("Error deleting contact");
//        }
//    }
//
//    private static void queryContact() {
//        System.out.println("Enter existing contact name: ");
//        String name = scanner.nextLine();
//        Contact existingContactRecord = mobilePhone.queryContact(name);
//        if (existingContactRecord == null) {
//            System.out.println("Contact not found.");
//            return;
//        }
//        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
//    }
//
//    private static void printContacts() {
//        mobilePhone.printContacts();
//    }
//
//    private static void startPhone() {
//        System.out.println("Starting phone...");
//    }
//
//    private static void printActions() {
//        System.out.println("\n Available actions: \npress");
//        System.out.println("0 - to shutdown\n" +
//                "1 - to print contacts\n" +
//                "2 - to add a new contact\n" +
//                "3 - to update existing an existing contact\n" +
//                "4 - to remove an existing contact\n" +
//                "5 - query if an existing contact exists\n" +
//                "6 - to print a list of available actions.");
//        System.out.println("Choose your action");
//    }
//        boolean quit = true;
//        int choice = 0;
//        printInstructions();
//        while (quit) {
//            System.out.println("Enter your choice ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice) {
//                case 0:
//                    printInstructions();
//                    break;
//                case 1:
//                    groceryList.printGroceryList();
//                    break;
//                case 2:
//                    addItem();
//                    break;
//                case 3:
//                    modifyItem();
//                    break;
//                case 4:
//                    removeItem();
//                    break;
//                case 5:
//                    searchForItem();
//                    break;
//                case 6:
//                    quit = false;
//                    break;
//            }
//        }
//        int[] myIntegers = getIntegers(5);
//        int[] sorted = sortIntegers(myIntegers);
//        printArray(sorted);
//
//        for (int i = 0; i < myIntegers.length; i++) {
//            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
//        }
//        System.out.println("The average is " + getAverage(myIntegers));
//
//        int[] array = {1, 5, 3, 7, 11, 9, 15};
//        System.out.println("Current Array = " + Arrays.toString(array));
//
//        reverse(array);
//        System.out.println("Reversed array = " + Arrays.toString(array));
//    }
//
//    public static void printInstructions() {
//        System.out.println("\n Press ");
//        System.out.println("\t 0 - Print choice options");
//        System.out.println("\t 1 - Print list grocery items");
//        System.out.println("\t 2 - Add line to list");
//        System.out.println("\t 3 - Modify item list");
//        System.out.println("\t 4 - Remove item list");
//        System.out.println("\t 5 - Search item list");
//        System.out.println("\t 6 - Quit application");
//    }
//
//    public static void addItem() {
//        System.out.print("Please enter the grocery item: ");
//        groceryList.addGroceryItem(scanner.nextLine());
//    }
//
//    public static void modifyItem() {
//        System.out.print("Enter item name: ");
//        String itemNo = scanner.nextLine();
//        System.out.println("Enter new item: ");
//        String newItem = scanner.nextLine();
//        groceryList.modifyGroceryItem(itemNo, newItem);
//
//    }
//
//    public static void removeItem() {
//        System.out.print("Enter item name: ");
//        String itemNo = scanner.nextLine();
//        groceryList.removeGroceryItem(itemNo);
//    }
//
//    public static void searchForItem() {
//        System.out.print("Item to search for: ");
//        String searchItem = scanner.nextLine();
//        if (groceryList.onFile(searchItem)) {
//            System.out.println("Found " + searchItem + " in our grocery");
//        } else {
//            System.out.println(searchItem + " is not in the list");
//        }
//    }
//
//    public static int[] getIntegers(int number) {
//        System.out.println("Enter " + number + " integer values.\r");
//        int[] values = new int[number];
//
//        for (int i = 0; i < values.length; i++) {
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }
//
//    private static int findMind(int[] array) {
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < array.length; i++) {
//            int value = array[i];
//            if (value < min) {
//                min = value;
//            }
//        }
//        return min;
//    }
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + " contents " + array[i]);
//        }
//    }
//
//    public static double getAverage(int[] array) {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        return (double) sum / (double) array.length;
//    }
//
//    public static int[] sortIntegers(int[] array) {
////        int[] sortedArray = new int[array.length];
////        for (int i = 0; i < array.length; i++) {
////            sortedArray[i] = array[i];
////        }
//        int[] sortedArray = Arrays.copyOf(array, array.length);
//        boolean flag = true;
//        int temp;
//        while (flag) {
//            flag = false;
//            for (int i = 0; i < sortedArray.length - 1; i++) {
//                if (sortedArray[i] < sortedArray[i + 1]) {
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i + 1];
//                    sortedArray[i + 1] = temp;
//                    flag = true;
//                }
//            }
//        }
//        return sortedArray;
//    }
//
//    private static void reverse(int[] array) {
//
//        int maxIndex = array.length - 1;
//        int halfLength = array.length / 2;
//
//        for (int i = 0; i < halfLength; i++) {
//            int temp = array[i];
//            array[i] = array[maxIndex - i];
//            array[maxIndex - i] = temp;
//        }
//    }
//        int[] myVariable;
//        myVariable = new int[10];
//        int[] myIntArray = new int[10];
//        myIntArray[0] = 45;
//        myIntArray[5] = 50;
//        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,10};
//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);
//        System.out.println(myIntArray2[2]);
//
//        for(int i=0;i<10; i++) {
//            myIntArray[i] = i*10;
//        }
//        printArray(myIntArray);
//    }
//
//    public static void printArray(int[] array) {
//        for(int i=0;i<array.length;i++) {
//            System.out.println("Element " + i + " value is " + array[i]);
//        }
//    }
    }
}
