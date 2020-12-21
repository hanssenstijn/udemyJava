package com.company;

public class Outlander extends Car2{
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocitiy = getCurrentVelocity() + rate;
        if (newVelocitiy == 0) {
            stop();
            changeGear(1);
        } else if(newVelocitiy >0 && newVelocitiy <= 10) {
            changeGear(1);
        } else {
            changeGear(2);
        }

        if(newVelocitiy > 0) {
            changeVelocity(newVelocitiy, getCurrentDirection());
        }
    }
}
