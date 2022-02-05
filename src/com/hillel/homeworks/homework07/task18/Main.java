package com.hillel.homeworks.homework07.task18;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for (int v: array) {
            int temp = set.size();
            set.add(v);
            if (set.size() > temp) {
                System.out.println("NO");
            } else
            System.out.println("YES");
        }
    }
}