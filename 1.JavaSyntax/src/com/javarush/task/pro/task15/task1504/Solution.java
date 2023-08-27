package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in);
                InputStream reader = Files.newInputStream(Paths.get(scanner.nextLine()));
                OutputStream writer = Files.newOutputStream(Paths.get(scanner.nextLine()));
        ) {

            byte[] bytes = reader.readAllBytes();
            byte[] out = new byte[bytes.length];

            for (int i = 0; i < bytes.length; i += 2) {
                if (i < bytes.length - 1) {
                    out[i] = bytes[i + 1];
                    out[i + 1] = bytes[i];
                } else {
                    out[i] = bytes[i];
                }

            }
            writer.write(out);

        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }

    }
}

