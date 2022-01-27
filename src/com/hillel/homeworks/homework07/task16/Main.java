package com.hillel.homeworks.homework07.task16;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(sumRecursion());
    }

    public static int sumRecursion() {
        int x = scanner.nextInt();
        if (x == 0) {
            return x;
        } else {
            return x + sumRecursion();
        }
    }
}