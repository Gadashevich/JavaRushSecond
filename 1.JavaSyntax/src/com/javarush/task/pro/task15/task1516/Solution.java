package com.javarush.task.pro.task15.task1516;

import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (Files.isDirectory(Path.of(line))) {
                System.out.println(line+THIS_IS_DIR);
            } else if (Files.isRegularFile(Path.of(line))) {
                System.out.println(line+ THIS_IS_FILE);
            } else{
                break;
            }
        }
    }
}

