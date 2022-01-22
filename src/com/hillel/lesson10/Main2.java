package com.hillel.lesson10;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- Create new marker");
        System.out.println("2- List markers");
        System.out.println("3- Print with marker");
    int option = scanner.nextInt();
    switch (option) {
        case 1:
            //aaaa
            break;

    }
    }


    private static class Marker {
        private final Color color;

        public Marker(Color color) {
            this.color = color;
        }

        public void print(String text) {
            System.out.println(color.name() + ": " + text);
        }
    }


    enum Color {
        RED,
        GREEN,
        BLUE,
        PINK,
        ;
    }
}
