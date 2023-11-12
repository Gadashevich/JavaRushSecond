package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        PersonScannerAdapter scannerAdapter = new PersonScannerAdapter(new Scanner(new File("D:\\JavaRushSecond\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1904\\test.txt")));
        System.out.println(scannerAdapter.read());
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] split = line.split(" ");
            SimpleDateFormat input = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            Person person = null;
            try {
                person = new Person(split[1], split[2], split[0], input.parse(split[3] + " " + split[4] + " " + split[5]));
            } catch (ParseException e) {
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
