// Task3 / input double && output integer + fractional part (separated by ", ")
package com.hillel.lesson02.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double inputVariable = console.nextDouble();
        int d1 = (int) inputVariable; // int
        double d2 = inputVariable % 1; // fractional of double
        System.out.println(d1 + ", " + d2);
    }
}
