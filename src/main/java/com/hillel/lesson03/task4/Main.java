package com.hillel.lesson03.task4;

import java.util.Scanner;
/*
Найти максимально большое 3х значное число из введенных трех цифр (0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        int temp;
        // sorting to make the largest 3 digits number
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        // concatenation of separate variables into one integer
        int result = (a * 100) + (b * 10) + c;
        System.out.println(result);
    }
}
