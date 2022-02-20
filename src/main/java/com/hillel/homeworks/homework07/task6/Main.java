package com.hillel.homeworks.homework07.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, d, e, f;
        double x, y;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();
        f = scanner.nextInt();

        double det = a * d - b * c;
        x = (e * d - b * f) / det;
        y = (a * f - e * c) / det;

        System.out.println(x + " " + y);

    }
}