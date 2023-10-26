package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileInputStream inputStream = new FileInputStream(fileName1);
             FileInputStream inputStream2 = new FileInputStream(fileName2)) {
            while (inputStream2.available() > 0) {
                byteArrayOutputStream.write(inputStream2.read());
            }
            while (inputStream.available() > 0) {
                byteArrayOutputStream.write(inputStream.read());
            }

            FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
            byteArrayOutputStream.writeTo(fileOutputStream);

            byteArrayOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {

        }


    }
}
