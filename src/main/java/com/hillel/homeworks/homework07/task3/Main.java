package com.hillel.homeworks.homework07.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int count = 0;
        while (true) {
            int x = scanner.nextInt();
            if (x > max) {
                max = x;
                count = 1;
            } else if (max == x) {
                count++;
            } else if (x == 0) {
                break;
            }
        }
        System.out.println(count);
    }
}