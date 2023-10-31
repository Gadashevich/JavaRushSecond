package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String txt;

        while (!(txt = reader.readLine()).equals("end")) {
            int index = txt.lastIndexOf("t");
            int partNumber = Integer.parseInt(txt.substring(index + 1));

            if (!treeMap.containsKey(partNumber)) {
                treeMap.put(partNumber, txt);
            }
        }

        for (String value : treeMap.values()) {
            int index = value.lastIndexOf(".");
            String nameFile = value.substring(0, index);

            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(value));
                 BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(nameFile))) {

                while (inputStream.available() > 0) {
                    outputStream.write(inputStream.read());
                }
            }
        }


    }
}
