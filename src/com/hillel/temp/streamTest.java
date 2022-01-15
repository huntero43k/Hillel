package com.hillel.temp;

import java.util.Arrays;
import java.util.stream.Collectors;

public class streamTest {
    public static void main(String[] args) {
        version1();
        version2();
    }

    public static void version1() {
        int[] arr = {5, 12, 34, 102, 4 ,5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] * 2);
            }
            System.out.print(" ");
        }
    }

    public static void version2() {
        Arrays.asList(5, 12, 34, 102, 4, 5).stream().map(t -> t % 2 == 0 ? t : t * 2).collect(Collectors.toList());
    }
}
