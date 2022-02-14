package com.hillel.homeworks.homework07.task20;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}