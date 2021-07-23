package ru.gb;

import java.io.IOException;

public class Human {
    private String name;

    public Human(String name){
        this.name=name;
    }

    public void toFillThePlate(Plate plate,int food){
    if(food>100){
        try{throw new IOException();}
        catch(IOException e) {
            System.out.println("Не переполняйте миску!");
            food=100;

}
    } plate.toAddTheFood(food);
    }}

