package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println(lines);
    }

    static {
        try {
        FileReader reader = new FileReader(Statics.FILE_NAME);
        BufferedReader bufferedReader = new BufferedReader(reader);
            while (bufferedReader.ready()){

                lines.add(bufferedReader.readLine());
            }
        }catch (IOException e){

        }
    }
}
