package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String key = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            key = scanner.nextLine();
            Movie movie;
            if (key.equalsIgnoreCase("soapOpera")) {
                movie = MovieFactory.getMovie(key);
            } else if (key.equalsIgnoreCase("thriller")) {
                movie = MovieFactory.getMovie(key);
            } else if (key.equalsIgnoreCase("cartoon")) {
                movie = MovieFactory.getMovie(key);
            } else {
                movie = MovieFactory.getMovie(key);
                break;
            }
            System.out.println(movie.getClass().getSimpleName());

        }



        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equalsIgnoreCase(key)) {
                movie = new SoapOpera();
            } else if ("Cartoon".equalsIgnoreCase(key)) {
                movie = new Cartoon();
            } else if ("Thriller".equalsIgnoreCase(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }
}
