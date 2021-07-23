package ru.gb;

import java.io.IOException;

public class Plate {
   private String name;
   private int food;
 public Plate(String name, int food){
     this.name=name;
     if(food>100){
         try{throw new IOException();}
         catch(IOException e) {
             System.out.println("Не переполняйте миску!");
             food=100;}
        } this.food=food;
 }
 public void decreaseFood (int appetite, Cat cat){
     if (this.food-appetite<0) {
     this.food =0;
     System.out.println("Котик не наелся! Наполните миску, пожалуйста");
      cat.setSatiety(false);
     }
     else {
         this.food -=appetite;
       cat.setSatiety(true);
     }
 }
    public void toAddTheFood (int food){
     this.food+=food;
//     if (this.food>100){
//             System.out.println("Миску нельзя переполнять!");
//             this.food=100;
//         }
    }
    public Integer getInfo (){
     return this.food;
    }
}
