package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
              FileReader fileReader = new FileReader(reader.readLine());
              FileWriter writer = new FileWriter(reader.readLine()))
        {
            while (fileReader.ready()){
                int read = fileReader.read();
                list.add(read);
            }
            for (int i = 1; i <list.size() ; i+=2) {
                writer.write(list.get(i));
            }

        } catch (IOException ignore) {
        }


    }
}