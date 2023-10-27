package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.HashMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {

        int[] ASC = new int[128];
        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()){
                ASC[reader.read()] ++;
            }
            for (int i = 0; i < ASC.length; i++) {
                if (ASC[i] != 0) {
                    System.out.println((char) i + " " + ASC[i]);
                }
            }


        } catch (IOException e) {

        }


    }
}
