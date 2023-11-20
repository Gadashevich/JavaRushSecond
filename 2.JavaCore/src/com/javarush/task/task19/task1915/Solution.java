package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
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

        String string = byteArrayOutputStream.toString();
        System.out.println(string);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream writer = new FileOutputStream(reader.readLine())) {
            writer.write(string.getBytes());
        } catch (IOException e) {

        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

