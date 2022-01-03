// Task4 / finding a mirror four-digits number (in success output is "1")
package com.hillel.lesson02.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        // separate digits from integer
        int a = n / 1000;
        int b = n % 1000 / 100;
        int c = n % 100 / 10;
        int d = n % 10;

        // check output digits with zeros
        // System.out.println(a + " " + b + " " + c + " " + d);

        // finding of mirror integer function
        int m1 = (a - d) * (a - d);
        int m2 = (b - c) * (b - c);
        int mirror = m1 + m2 + 1;

        System.out.println(mirror);

    }
}