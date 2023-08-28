package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        
        OutputStream outputStream = connection.getOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        printStream.println("hello world");

        InputStream inputStream = connection.getInputStream();
        byte[] bytes = inputStream.readAllBytes();
        String str = new String(bytes);
        System.out.println(str);
    }
}

