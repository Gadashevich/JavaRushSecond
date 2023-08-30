package com.javarush.task.pro.task17.task1717;

public class Eagle extends Aircraft implements Flyable {

    public static void main(String[] args)
    {
        System.out.println(x);
        x = new String("abc");
        System.out.println(x);
    }

    @Override
    public int getMaxSpeed() {
        return 180;
    }
}
