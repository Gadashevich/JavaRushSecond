package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String fileName = console.readLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            int max = 0;
            while (reader.ready()) {
                String line = reader.readLine();
                String id = line.substring(0, 8).trim();
                int parseId = Integer.parseInt(id);
                if (parseId > max) max = parseId;
            }
            if (args.length != 0) {
                if (args[0].equals("-c")) {
                    String maxId = checkLength(String.valueOf(++max), 8);
                    String productName = checkLength(args[1], 30);
                    String price = checkLength(args[2], 8);
                    String quantity = checkLength(args[3], 4);
                    writer.newLine();
                    writer.write(maxId + productName + price + quantity);
                }
            }

        }
    }

    public static String checkLength(String text, int limit) {
        if (text.length() > limit) {
            return text.substring(0, limit);
        } else {
            // return text + " ".repeat(limit - text.length());
            StringBuilder builder = new StringBuilder(text);

            while (builder.length() != limit) {
                builder.append(" ");
            }
            return builder.toString();
        }
    }

}
