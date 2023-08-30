package com.javarush.task.pro.task17.task1706;

/* 
Хищники vs Травоядные
*/

public class Solution {
    public static void main(String[] args) {
        printRation(new Cow());
        printRation(new Lion());
        printRation(new Elephant());
        printRation(new Wolf());
    }

    public static void printRation(Animal animal){
        if(animal instanceof Predator){
            System.out.println("Любит мясо");


        } else if( animal instanceof  Herbivore){
            System.out.println("Любит траву");

        }

    }
}
