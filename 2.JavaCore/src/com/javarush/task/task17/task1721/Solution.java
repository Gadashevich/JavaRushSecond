package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        allLines.addAll(Files.readAllLines(Paths.get(scanner.nextLine())));
        forRemoveLines.addAll(Files.readAllLines(Paths.get(scanner.nextLine())));
        new Solution().joinData();


    }

    public void joinData() throws CorruptedDataException {

        if (new HashSet<>(allLines).containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
