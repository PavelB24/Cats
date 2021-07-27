package ru.gb;

import java.util.Random;

public class Cat {
    private String name;
    int age;
    private final Random random = new Random();
    private boolean satiety;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void toEat(Plate plate) {
        plate.decreaseFood(random.nextInt(10), this);
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
