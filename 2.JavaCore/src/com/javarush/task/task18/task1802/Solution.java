package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        int aByte = 255;
        try (FileInputStream file = new FileInputStream(fileName)) {
            while (file.available() > 0) {
                int tmp = file.read();
                if (tmp < aByte) aByte = tmp;

            }

        }
        System.out.println(aByte);
    }
}