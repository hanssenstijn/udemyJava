package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    private double total;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return (this.firstNumber + this.secondNumber);
    }

    public double getSubtractionResult() {
        return (this.firstNumber * this.secondNumber);
    }

    public double getMultiplicationResult() {
        return (this.firstNumber * this.secondNumber);
    }

    public double getDivisionResult() {
        if(secondNumber != 0) {
            total = (this.firstNumber / this.secondNumber);
        } else {
            total = 0;
        }
        return total;
    }
}
