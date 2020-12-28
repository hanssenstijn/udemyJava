package com.company;

public class Car3 extends Vehicle2 {
    private int doors;
    private int engineCapacity;

    public Car3(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
