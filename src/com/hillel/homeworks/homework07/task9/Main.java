package com.hillel.homeworks.homework07.task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {   // if value arr[i] == arr[j] value && index i != j count++
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}