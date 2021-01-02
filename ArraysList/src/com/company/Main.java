package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {



//    private static Scanner scanner = new Scanner(System.in);
//    private static GroceryList groceryList = new GroceryList();
//
//    public static void main(String[] args) {
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
