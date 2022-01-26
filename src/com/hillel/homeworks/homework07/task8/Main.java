package com.hillel.homeworks.homework07.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
