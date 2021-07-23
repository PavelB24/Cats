package ru.gb;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat(5, "jojo");
        Plate plate1 = new Plate ("Plate of cats", 80);
        Human owner = new Human("Паша");
        owner.toFillThePlate(plate1, 0);
        List<Cat> catList=new ArrayList<>();
        catList.add(cat);
        catList.add(new Cat(3, "Bongo"));
        catList.add(new Cat(8, "Вася"));
        for (int i = 0; i <catList.size() ; i++) {
            System.out.println();
            catList.get(i).toEat(plate1);
            System.out.println("Котик сыт? "+catList.get(i).getSatiety()+ ", миска заполнена на " +plate1.getInfo()+ "%");
            Thread.sleep(3000);


        }
    }
}
