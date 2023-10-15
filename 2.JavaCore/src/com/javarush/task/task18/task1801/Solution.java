package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int aByte = 0;

        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {
            while (fileInputStream.available() > 0) {
                int readByte = fileInputStream.read();
                if (readByte > aByte) aByte = readByte;
            }
        }
        System.out.println(aByte);
    }
}

