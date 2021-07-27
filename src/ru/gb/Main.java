package ru.gb;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat(5, "jojo");
        Plate plate1 = new Plate("Plate of cats", 80);
        Human owner = new Human("Паша");
        owner.toFillThePlate(plate1, 0);
        List<Cat> catList = new ArrayList<>();
        catList.add(cat);
        catList.add(new Cat(3, "Bongo"));
        catList.add(new Cat(8, "Вася"));
        toFeedSomeCats(catList, plate1);
        toAddTheFood(owner, plate1);
        toFeedSomeCats(catList, plate1);
    }

    private static void toAddTheFood(Human owner, Plate plate) {
        owner.toFillThePlate(plate, 100);
        System.out.println("Сейчас  мисочка " + plate.getName() + " на " + plate.getInfo() + " % заполненна кормом!");
    }

    public static void toFeedSomeCats(List<Cat> catList, Plate plate) {
        for (Cat cat : catList) {
            System.out.println();
            cat.toEat(plate);
            System.out.println("Котик сыт? " + cat.getSatiety() + ", миска заполнена на " + plate.getInfo() + "%");
        }
    }
}
