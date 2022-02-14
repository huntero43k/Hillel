package com.hillel.homeworks.homework07.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String [][] arr = new String[n][n];

        // fill Array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i == n - 1 - j || i == n / 2 || j == n / 2) {
                    arr[i][j] = "*";
                } else {
                    arr[i][j] = ".";
                }
            }
        }

        // add space and \n to make array beautiful
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}