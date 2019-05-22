package ru.job4j.loop;

public class Car {
    private double volume;

    public void drive(int kilometer) {
        this.volume = this.volume - kilometer;
    }

    public void fill(int gas) {
        this.volume = this.volume + 10 * gas;
    }

    public boolean canDrive() {
        return this.volume > 0;
    }

    public void gasInfo() {
        System.out.println("I can drive " + this.volume + " kilometers.");
    }
}
