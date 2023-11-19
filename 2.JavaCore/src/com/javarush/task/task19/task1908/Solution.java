package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String pathOne = console.readLine();
        String pathTwo = console.readLine();

        console.close();


        try (BufferedReader reader = new BufferedReader(new FileReader(pathOne));
             BufferedWriter writer = new BufferedWriter(new FileWriter(pathTwo, true))) {

            while (reader.ready()) {
                String line = reader.readLine();
                String[] strings = line.split(" ");
                for (String string : strings) {
                    try {
                        int num = Integer.parseInt(string);
                        writer.write(num + " ");
                    } catch (Exception e) {

                    }
                }
            }
        } catch (IOException e) {

        }

    }
}
