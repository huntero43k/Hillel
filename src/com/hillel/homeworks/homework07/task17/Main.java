package com.hillel.homeworks.homework07.task17;

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
        for (int x : array) {
            set.add(x);
        }
        System.out.println(set.size());
    }
}