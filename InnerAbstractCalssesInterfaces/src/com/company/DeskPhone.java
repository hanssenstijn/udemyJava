package com.company;

public class DeskPhone implements ITelephone{

    private int myNumber;
    private boolean isRining;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No actions taken, desk phone does not have a power button");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on desk phone");
    }

    @Override
    public void answer() {
        if(isRining) {
            System.out.println("Answering the desk phone");
            isRining = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRining = true;
            System.out.println("Ring ring");
        } else {
            isRining = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRining;
    }
}
