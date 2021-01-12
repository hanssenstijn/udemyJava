package com.company;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRining;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");

    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now ringing " + phoneNumber + " on desk phone");
        } else {
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {
        if(isRining) {
            System.out.println("Answering the mobile phone");
            isRining = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRining = true;
            System.out.println("Melody playing");
        } else {
            isRining = false;
            System.out.println("Mobile phone not on or number different");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRining;
    }
}