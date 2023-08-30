package com.javarush.task.pro.task17.task1717;

public class Aircraft implements Flyable {
    static String  x = "name";
    @Override
    public int getMaxSpeed() {
        return 1200;
    }
}
