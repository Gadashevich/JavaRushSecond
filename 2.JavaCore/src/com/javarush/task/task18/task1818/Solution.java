package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) {


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream outputStream = new FileOutputStream(reader.readLine());
             FileInputStream inputStream2 = new FileInputStream(reader.readLine());
             FileInputStream inputStream3 = new FileInputStream(reader.readLine())) {

            while (inputStream2.available() > 0) {
                int read = inputStream2.read();
                outputStream.write(read);
            }
            while (inputStream3.available()>0){
                int read = inputStream3.read();
                outputStream.write(read);
            }


        } catch (IOException e) {


        }


    }
}
