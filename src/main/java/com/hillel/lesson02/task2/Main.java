// Task2 / input two integers separated by a space && output sum of this integers
package com.hillel.lesson02.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int intSum = console.nextInt() + console.nextInt();
        System.out.println(intSum);
    }
}
