package com.hillel.lesson04;

import java.util.Scanner;

public class Temp_youtube {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var a = console.nextInt();
        System.out.println(fibFunction(a));

    }

    private static long fibFunction(int n) {
        long[] array = new long[n + 1];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
}
//    // рекурсия
//    private static long fibSimple(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        return fibSimple(n - 1) + fibSimple(n - 2);
//    }
//}
