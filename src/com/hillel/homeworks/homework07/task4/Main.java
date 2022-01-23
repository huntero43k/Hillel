package com.hillel.homeworks.homework07.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! NOT READY !!!!!!!!!!!!!!!!!!!!!!!!!!
        int max = 0;
        int max2 = 0;
        while (true) {
            int x = scanner.nextInt(); // need to check with 2 3 5 4 2 1 8 0
            if (x > max) {
                max = x;
            } else if (max2 <= x) {
                max2 = x;
            } else if (x == 0) {
                break;
            }
        }
        System.out.println(max2);
    }
}