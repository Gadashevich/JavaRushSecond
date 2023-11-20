package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(out);

        String string = byteArrayOutputStream.toString().trim();
        String[] split = string.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[2]);
        int rez;

        if (split[1].equals("+")) {
            rez = a + b;
            System.out.print(a + " " + split[1] + " " + b + " = " + rez);
        } else if (split[1].equals("-")) {
            rez = a - b;
            System.out.print(a + " " + split[1] + " " + b + " = " + rez);
        } else if (split[1].equals("*")) {
            rez = a * b;
            System.out.print(a + " " + split[1] + " " + b + " = " + rez);
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

