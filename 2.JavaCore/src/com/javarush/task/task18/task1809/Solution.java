package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(reader.readLine());
             FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine()))
        {
            ArrayList<Integer> list = new ArrayList<>();
            while (fileInputStream.available()>0){
                    list.add(0,fileInputStream.read());
            }
            for (Integer integer : list) {
                    fileOutputStream.write(integer);
            }


        } catch (IOException e) {

        }

    }
}
