package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.*;

/*
Прайсы 2
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            while (reader.ready()) {
                String line = reader.readLine();
                String id = line.substring(0, 8).trim();
                if (!map.containsKey(id)) {
                    map.put(id, line.substring(8));
                }
            }

            if (args.length != 0) {
                if (args[0].equals("-u")) {
                    String id = args[1].trim();
                    for (String s : map.keySet()) {
                        if (s.equals(id)) {
                            String productName = checkLength(args[2], 30);
                            String price = checkLength(args[3], 8);
                            String quantity = checkLength(args[4], 4);
                            map.put(id, productName + price + quantity);
                        }
                    }
                } else if (args[0].equals("-d")) {
                    String id = args[1].trim();
                    map.remove(id);
                }
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, String> pair : map.entrySet()) {
                writer.write(checkLength(pair.getKey(), 8) + pair.getValue());
                writer.newLine();
            }
        }
    }

    public static String checkLength(String text, int limit) {
        if (text.length() > limit) return text.substring(0, limit);
        else {
            StringBuilder builder = new StringBuilder(text);
            while (builder.length() != limit) {
                builder.append(" ");
            }
            return builder.toString();
        }
    }

}
