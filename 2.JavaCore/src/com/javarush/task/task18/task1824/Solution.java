package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try (FileInputStream inputStream = new FileInputStream(reader.readLine())) {

            } catch (FileNotFoundException e) {

            }

        }
    }
}
