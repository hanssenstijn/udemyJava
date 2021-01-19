package com.company;

public class Pegiun extends Bird {
    public Pegiun(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am not very good at that, can only go for a swim");
    }
}
