package com.company;

public class Main {

    public static void main(String[] args) {
        int[] myVariable;
        myVariable = new int[10];
        int[] myIntArray = new int[10];
//        myIntArray[0] = 45;
//        myIntArray[5] = 50;
        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,10};
        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]);
        System.out.println(myIntArray2[2]);

        for(int i=0;i<10; i++) {
            myIntArray[i] = i*10;
        }
        printArray(myIntArray);
    }

    public static void printArray(int[] array) {
        for(int i=0;i<array.length;i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }
}
