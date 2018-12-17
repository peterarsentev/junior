package ru.job4j.calculator;

public class Car {
    private double volume;

    public void drive(int kilometer) {
        this.volume = this.volume - kilometer;
        boolean canDrive = this.volume > 0;
        if (canDrive) {
            System.out.println("Beep! I can drive!");
        } else {
            System.out.println("Oh. I am tired. I can't drive.");
        }
    }

    public void fill(int gas) {
        this.volume = this.volume + 10 * gas;
    }

    public boolean canDrive() {
        boolean result = this.volume > 0;
        if (result) {
            System.out.println("Beep! I can drive.");
        }
        return result;
    }

    public void gasInfo() {
        System.out.println("I can drive " + this.volume + " kilometers.");
    }
}
