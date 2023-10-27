package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();

        try(BufferedReader inputStream = new BufferedReader(new FileReader(fileOne));
        PrintWriter printWriter = new PrintWriter(fileTwo)) {

            while (inputStream.ready()){
                String[] split = inputStream.readLine().split(" ");

                for (String number : split) {
                    double aDouble = Double.parseDouble(number);
                    long round = Math.round(aDouble);
                    printWriter.print(round + " ");
                }
            }


        }

    }
}


