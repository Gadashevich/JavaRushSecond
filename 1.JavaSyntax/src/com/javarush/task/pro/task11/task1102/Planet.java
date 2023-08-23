package com.javarush.task.pro.task11.task1102;

/* 
Земля: техническая характеристика
*/

public class Planet {

    public static String name;

    public static long age;

    public static int speed;

    public static int area;

    public void printInformation() {
        System.out.println("Имя планеты: " + name + ".");
        System.out.println("Возраст: " + age + " лет.");
        System.out.println("Орбитальная скорость: " + speed + " км/ч.");
        System.out.println("Общая площадь: " + area + " кв. км.");
    }
}
