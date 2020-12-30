package com.company;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("healthy", meat, price, "Brown rye");
    }

    public void addHealthAddtion1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddtion2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }



}
