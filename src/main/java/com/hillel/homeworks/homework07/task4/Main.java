package com.hillel.homeworks.homework07.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int max2 = 0;
        int temp;
        while (true) {
            int x = scanner.nextInt();
            if (x >= max2) {
                max2 = x;
            } if (max2 > max) {
                temp = max;
                max = max2;
                max2 = temp;
            } else if (x == 0) {
                break;
            }
        }
        System.out.println(max2);
    }
}