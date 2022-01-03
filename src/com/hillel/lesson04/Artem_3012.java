package com.hillel.lesson04;

import java.util.Scanner;

public class Artem_3012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            System.out.print(arr[i] + " ");
        }
    }

}
