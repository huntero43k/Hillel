package com.hillel.lesson03.task2;

import java.util.Scanner;
/*
Существует ли треугольник с такими сторонами?
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        triangle(a,b,c);
    }
    // method for checking of a triangle existence
    public static void triangle(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
