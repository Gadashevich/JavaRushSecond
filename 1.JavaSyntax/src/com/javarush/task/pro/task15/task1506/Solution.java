package com.javarush.task.pro.task15.task1506;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main1(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
        ) {
            List<String> strings = Files.readAllLines(Path.of(scanner.nextLine()));

            for (String string : strings) {
                char[] chars = string.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char aChar = chars[i];
                    if (aChar != ' ' && aChar != ',' && aChar !='.'){
                    System.out.print(aChar);
                    }

                }
                System.out.println();
            }

        } catch (IOException e) {

        }
    }

    public static void main(String[] args) throws Exception{
        Files.readAllLines(Path.of(new Scanner(System.in).nextLine()))
                .stream()
                .map(str -> str.replaceAll("[,. ]",""))
                .forEach(System.out::println);
    }
}

