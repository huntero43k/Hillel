package com.hillel.homeworks.homework07.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, D;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        D = b * b - 4 * a * c;

        if (D > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            if (x1 < x2) {
                System.out.println(2 + " " + x1 + " " + x2);
            }
            else {
                System.out.println(2 + " " + x2 + " " + x1);
            }
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println(1 + " " + x);
        }
        else {
            System.out.println(0);
        }
    }
}