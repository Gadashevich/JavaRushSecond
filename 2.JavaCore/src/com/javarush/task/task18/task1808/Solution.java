package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine());
             FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
             FileOutputStream outputStream2 = new FileOutputStream(reader.readLine())) {

            int halfFile = (inputStream.available() + 1) / 2;
            System.out.println(halfFile);

            int count = 0;

            while (inputStream.available() > 0) {
                if (count < halfFile) {
                    outputStream1.write(inputStream.read());
                    count++;
                } else {
                    outputStream2.write(inputStream.read());
                }
            }


        } catch (IOException e) {

        }

    }
}
