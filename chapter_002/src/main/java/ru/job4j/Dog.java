package ru.job4j;

public class Dog {
    private Pet pet = new Pet();

    public void sound() {
        this.pet.sound();
    }
}
