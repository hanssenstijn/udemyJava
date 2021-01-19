package com.company;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breath() {
        System.out.println("breath in and out");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
