package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String destinationFileName = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName));
        StringBuilder builder = new StringBuilder();
        String tmp="";

        while(!tmp.equalsIgnoreCase("exit") ){
            tmp = reader.readLine();
            builder.append(tmp).append("\n");
        }
            writer.write(builder.toString());

        reader.close();
        writer.close();

    }
}
