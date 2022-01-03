package com.hillel.lesson04;

import java.util.Scanner;

public class Temp5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int A = console.nextInt();
        System.out.println(fib(A));


    }

    public static int fib(int n) {
        int[] fibonacciArray = new int[n + 1];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        int count = 0;
        for (int i = 2; i < fibonacciArray.length; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            //System.out.print(fibonacciArray[i] + " ");
            count++;
        }
        return count;
    }
}

