package com.hillel.homeworks.homework07.task10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // !!!!!!!!!!!!!!!! NOT READY !!!!!!!!!!!!!!!!!
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String [][] arr = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ".";
            }
        }
        System.out.println();
    }
}
