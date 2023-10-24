package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int space = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                int readedChar = fileReader.read();
                count++;
                if (readedChar == (int) ' ') space++;
            }
        }
        if (count != 0) {
            double result = (double) space / count * 100;
            System.out.printf("%.2f", result);
        }
    }
}
