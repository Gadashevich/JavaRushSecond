package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        while (reader.ready()){
            String[] strings = reader.readLine().split(" ");
            for (String string : strings) {
                if (string.matches(".*[0-9].*")){
                    writer.write(string+" ");
                }
            }

        }
        reader.close();
        writer.close();



    }
}
