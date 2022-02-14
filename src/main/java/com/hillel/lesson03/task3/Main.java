package com.hillel.lesson03.task3;

import java.util.Scanner;
/*
Упорядочить 3 целых числа в порядке возрастания/неубывания
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        int temp;
        // sort numbers in ascending order
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
