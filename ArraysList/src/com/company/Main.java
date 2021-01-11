package com.company;

import java.util.*;

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
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Storm bringer",4.6);
        album.addSong("Storm  bringer",1.6);
        album.addSong("Storm Bringer",2.6);
        album.addSong("Holy man",3.6);
        album.addSong("Hold on",5.6);
        album.addSong("The gypsy",6.6);
        album.addSong("Soldier of fortune",7.6);
        albums.add(album);

        album = new Album("For those about to rock","AC/DC");
        album.addSong("For those about to rock",5.44);
        album.addSong("Lets go",2.44);
        album.addSong("Snowballed",3.44);
        album.addSong("Evil walks",1.44);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do right",playList);
        albums.get(0).addToPlayList("Holy man",playList);
        albums.get(0).addToPlayList("Speed king",playList);
        albums.get(1).addToPlayList(6,playList);
        albums.get(1).addToPlayList(5,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(24,playList);

        play(playList);

//        String[] strArray = new String[10];
//        int[] intArray = new int[10];
//
//        ArrayList<String> strArrayList = new ArrayList<String>();
//        strArrayList.add("Tim");
//
////        ArrayList<int> intArrayList = new ArrayList<int>();
//        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
//        intClassArrayList.add(new IntClass(54));
//        Integer integer = new Integer(54);
//        Double doubleValue = new Double(12.125);
//
//        ArrayList<Integer> intArrrayList = new ArrayList<Integer>();
//        for( int i=0; i<10; i++) {
//            intArrrayList.add(Integer.valueOf(i));
//        }
//
//        for( int i=0; i<10; i++) {
//            System.out.println(i + " --> " + intArrrayList.get(i).intValue());
//        }
//
//        Integer myIntValue = Integer.valueOf(56);
//        int myInt = myIntValue.intValue();
//
//        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
//        for(double dbl=0.0; dbl<10.0; dbl += 0.5){
//            myDoubleValues.add(Double.valueOf(dbl));
//        }
//
//        for(int i=0; i<myDoubleValues.size(); i++) {
//            double value = myDoubleValues.get(i).doubleValue();
//            System.out.println(i + " --> " + value);
//        }

//        Bank bank = new Bank("NB");
//        if (bank.addBranch("Adelaide")) {
//            System.out.println("Adelaide branch createdss");
//        }
//        ;
//        bank.addCustomer("Adelaide", "Tim", 50.50);
//        bank.addCustomer("Adelaide", "Mike", 60.50);
//        bank.addCustomer("Adelaide", "Percy", 20.50);
//
//        bank.addBranch("Sydney");
//        bank.addCustomer("Sydney", "Bob", 105.54);
//
//        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
//        bank.addCustomerTransaction("Adelaide", "Tim", 14.22);
//        bank.addCustomerTransaction("Adelaide", "Mike", 24.22);
//
//        bank.listCustomers("Adelaide", true);
//        bank.listCustomers("Sydney", true);
//
//        if (!bank.addCustomer("Melbourne", "Brian", 53.34)) {
//            System.out.println("Melbourne branch does not exist");
//        }
//
//        if (!bank.addBranch("Adelaide")) {
//            System.out.println("Adelaide already exists");
//        }
//
//        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 25.55)) {
//            System.out.println("Customer does not exist at branch");
//        }
//
//        if (!bank.addCustomer("Adelaide", "Tim", 12.21)) {
//            {
//                System.out.println("Customer already exists");
//            }
//        }
//
//        Customer2 customer2 = new Customer2("Tim", 54.96);
//        Customer2 anothercustomer2;
//        anothercustomer2 = customer2;
//        anothercustomer2.setBalance(12.18);
//        System.out.println("Balance for customer " + customer2.getName() + " is " + customer2.getBalance());
//
//        ArrayList<Integer> intList = new ArrayList<Integer>();
//
//        intList.add(1);
//        intList.add(1);
//        intList.add(1);
//
//        for (int i = 0; i < intList.size(); i++) {
//            System.out.println(i + " ; " + intList.get(i));
//        }
//
//        intList.add(1,2);
//
//        for (int i = 0; i < intList.size(); i++) {
//            System.out.println(i + " ; " + intList.get(i));
//        }
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

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No song in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("PlayList complete.");
                    quit = true;
                    break;
                case 1:
                    break;

            }
        }
    }
}
