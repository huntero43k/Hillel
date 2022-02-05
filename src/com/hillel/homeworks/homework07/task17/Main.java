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
        System.out.println(countDistinct(array));

//        Set<Integer> set = new HashSet<>();
//        for (int x : array) {
//            set.add(x);
//        }
//        System.out.println(set.size());
    }

    static int countDistinct(int[] array) {
        int result = 1;

        for (int i = 1; i < array.length; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    break;
                }
            }
            if (i == j) {
                result++;
            }
        }
        return result;
    }
}