package com.javarush.task.task19.task1919;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

/* 
Считаем зарплаты
*/

public class Solution {
//    public static void main(String[] args) {
//        TreeMap<String, Double> map = new TreeMap<>();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
//
//            while (reader.ready()) {
//                String[] strings = reader.readLine().split(" ");
//                String key = strings[0];
//                Double value = Double.parseDouble(strings[1]);
//
//                if (!map.containsKey(key)) {
//                    map.put(key, value);
//
//                } else {
//                    Double oldValue = map.get(key);
//                    map.put(key, value + oldValue);
//                }
//
//            }
//
//            for (Map.Entry<String, Double> entry : map.entrySet()) {
//                System.out.println(entry.getKey() + " " + entry.getValue());
//            }
//        } catch (IOException e) {
//
//        }
//    }

    public static void main(String[] args) throws IOException {
        Files.readAllLines(Path.of(args[0])).stream().collect(Collectors.toMap(
                s -> s.split(" ")[0],
                s -> Double.parseDouble(s.split(" ")[1]),
                (aDouble, aDouble2) -> aDouble + aDouble2,
                () -> new TreeMap<>())).forEach((k, v) -> System.out.println(k + " " + v));

    }


}

 