package com.hillel.homeworks.homework07.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        while (true) {
            int x = scanner.nextInt();
            if (x > temp) {
                temp = x;
            } else if (x == 0) {
                break;
            }
        }
        System.out.println(temp);
    }
}
