package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.transverse(list.getRoot());

        Level myCons = Level.HIGH;

        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }

//        Dog dog = new Dog("Yorkie");
//        dog.breath();
//        dog.eat();
//
//        Parrot parrot = new Parrot("Parrot");
//        parrot.breath();
//        parrot.eat();
//        parrot.fly();
//
//        Pegiun pegiun = new Pegiun("Emperor");
//        pegiun.fly();

//        Gearboxing mcLaren = new Gearboxing(6);
//        mcLaren.addGear(1,5.3);
//        mcLaren.addGear(2,10.6);
//        mcLaren.addGear(3,15.9);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));

//        Gearboxing.Gear first = mcLaren.new Gear(1,12.3);
//        Gearboxing.Gear second = new Gearboxing.Gear(2,15.4);
//        Gearboxing.Gear third = new mcLaren.Gear(3,17.8);
//        System.out.println(first.driveSpeed(10000));

//        ITelephone timsPhone;
//        timsPhone = new DeskPhone(123456);
//        timsPhone.powerOn();
//        timsPhone.callPhone(123456);
//        timsPhone.answer();
//
//        timsPhone = new MobilePhone(23456);
//        timsPhone.powerOn();
//        timsPhone.callPhone(23456);
//        timsPhone.answer();

//        Player tim = new Player("Tim",10,15);
//        System.out.println(tim.toString());
//        saveObject(tim);
//        tim.setHitPoints(8);
//        System.out.println(tim);
//        tim.setWeapon("Stormbringer");
//        saveObject(tim);
//        loadObject(tim);
//        System.out.println(tim);
//
//        ISaveable werewolf = new Monster("Werewolf",20,40);
//        System.out.println(werewolf);
//        saveObject(werewolf);
//        System.out.println("Strength is " + ((Monster) werewolf).getStrength());
//
//
//    }
//
//    public static ArrayList<String> readValues() {
//        ArrayList<String> values = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//        int index = 0;
//        System.out.println("Choose\n +" +
//                "1 to enter a string\n" +
//                "0 to quit");
//
//        while (!quit) {
//            System.out.println("Choose an action: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 0:
//                    quit = true;
//                    break;
//                case 1:
//                    System.out.println("Enter a string ");
//                    String stringInput = scanner.nextLine();
//                    values.add(index, stringInput);
//                    index++;
//                    break;
//            }
//        }
//        return values;
//    }
//
//    public static void saveObject(ISaveable objectToSave) {
//        for(int i=0; i<objectToSave.write().size(); i++) {
//            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
//        }
//    }
//
//    public static void loadObject(ISaveable objectToLoad) {
//        ArrayList<String> values = readValues();
//        objectToLoad.read(values);
    }
}
