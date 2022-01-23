package com.hillel.homeworks.homework07.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (true) {
            int x = scanner.nextInt();
            if (x > max) {
                max = x;
            } else if (x == 0) {
                break;
            }
        }
        System.out.println(max);
    }
}