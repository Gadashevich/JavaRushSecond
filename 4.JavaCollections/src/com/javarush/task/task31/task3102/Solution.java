package com.javarush.task.task31.task3102;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

/* 
Находим все файлы
*/

public class Solution {

    public static List<String> getFileTree(String root) throws IOException {
        List<String> list = new ArrayList<>();
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Path.of(root));

        for (Path path : directoryStream) {
            if (Files.isRegularFile(path)) {
                list.add(path.toString());
            } else if (Files.isDirectory(path)) {
                getFileTree(path.toString());

            }
        }

        return list;

    }

    public static void main(String[] args) {

    }
}