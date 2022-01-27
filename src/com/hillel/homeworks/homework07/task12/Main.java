package com.hillel.homeworks.homework07.task12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(min4(a,b,c,d));
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int min4(int a, int b, int c, int d) {
        return min(min(a, b), min(c, d));
    }
}