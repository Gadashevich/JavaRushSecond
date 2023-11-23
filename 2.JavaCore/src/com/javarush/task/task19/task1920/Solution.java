package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

/* 
Самый богатый
*/

public class Solution {
//    public static void main(String[] args) throws IOException {
//        TreeMap<String, Double> treeMap = new TreeMap<>();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
//            while (reader.ready()) {
//                String[] strings = reader.readLine().split(" ");
//
//                String key = strings[0];
//                Double value = Double.parseDouble(strings[1]);
//
//                treeMap.merge(key,value, Double::sum);
//            }
//        }
//
//        Double max = treeMap.values().stream().max(Double::compare).get();
//        TreeSet<String> set = new TreeSet<>();
//
//        for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
//            if(entry.getValue().equals(max)){
//                    set.add(entry.getKey());
//            }
//        }
//
//        set.forEach(System.out::println);
//
//
//    }

    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = Files.readAllLines(Path.of(args[0])).stream()
                .collect(Collectors.toMap(
                        s -> s.split(" ")[0],
                        s -> Double.parseDouble(s.split(" ")[1]),
                        Double::sum, TreeMap::new));

        map.entrySet().stream()
                .filter(entry -> Objects.equals(entry.getValue(),map.values().stream().max(Double::compare).orElseThrow()))
                .forEach(entry -> System.out.println(entry.getKey()));


    }


}
