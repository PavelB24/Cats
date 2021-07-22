package ru.gb;

public class Human {
    private String name;

    public Human(String name){
        this.name=name;
    }

    public void toFillThePlate(Plate plate,int food){
        plate.toAddTheFood(food);
    }
}

