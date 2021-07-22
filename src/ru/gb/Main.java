package ru.gb;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(5, "jojo");
        Plate plate1 = new Plate ("Jojos plate", 100);
        Human owner = new Human("Паша");
        cat.toEat(plate1);
        System.out.println(cat.getSatiety());
        System.out.println(plate1.getInfo());
        owner.toFillThePlate(plate1, 100);
        System.out.println(plate1.getInfo());
    }
}
