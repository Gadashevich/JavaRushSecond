package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> list = new ArrayList<>();
        File file = new File(root);
        File parentFile = file.getParentFile();

        for (File listFile : parentFile.listFiles()) {
            list.add(listFile.getName());
        }
        return list;

    }

    public static void main(String[] args) {

    }
}
