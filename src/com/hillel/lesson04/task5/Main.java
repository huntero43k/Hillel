package com.hillel.lesson04.task5;

import java.util.Scanner;
/*
Дано целое число A (A>1). Определите, каким по счету числом Фибоначчи оно является, (выведите число N, что F(N) = A).
Если А не является числом Фибоначчи, выведите число -1
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int A = console.nextInt();
        int fib0 = 0;
        int fib1 = 1;
        int N = 0;
        while (A != fib0) {
            fib1 = fib1 + fib0;
            fib0 = fib1 - fib0;
            ++N;
            if (A < fib0) {
                N = -1;
                break;
            }
        }
        System.out.println(N);
    }
}