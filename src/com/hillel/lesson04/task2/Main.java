package com.hillel.lesson04.task2;

import java.util.Scanner;
/*
Является ли число N точной степенью двойки?
Sample Input 1: 1 Sample Output 1: YES Sample Input 2: 2 Sample Output 2: YES
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var N = console.nextLong();

        while (N % 2 == 0) {
            N = N / 2;
        }
        if (N == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}