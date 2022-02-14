package com.hillel.lesson03.task5;

import java.util.Scanner;
/*
Определить, можно ли разместить одну из этих коробок внутри другой,
при условии, что поворачивать коробки можно только на 90 градусов вокруг ребер.
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a1 = console.nextInt();
        int b1 = console.nextInt();
        int c1 = console.nextInt();

        int a2 = console.nextInt();
        int b2 = console.nextInt();
        int c2 = console.nextInt();

        int temp;
        // sorting the sides of the first box
        if (a1 > b1) {
            temp = a1;
            a1 = b1;
            b1 = temp;
        }
        if (a1 > c1) {
            temp = a1;
            a1 = c1;
            c1 = temp;
        }
        if (b1 > c1) {
            temp = b1;
            b1 = c1;
            c1 = temp;
        }
        // sorting the sides of the second box
        if (a2 > b2) {
            temp = a2;
            a2 = b2;
            b2 = temp;
        }
        if (a2 > c2) {
            temp = a2;
            a2 = c2;
            c2 = temp;
        }
        if (b2 > c2) {
            temp = b2;
            b2 = c2;
            c2 = temp;
        }
        // comparison of two boxes
        if (a1 == a2 && b1 == b2 && c1 == c2) {
            System.out.println("Boxes are equal");
        } else {
            if (a1 <= a2 && b1 <= b2 && c1 <= c2) {
                System.out.println("The first box is smaller than the second one");
            }
            else {
                if (a1 >= a2 && b1 >= b2 && c1 >= c2) {
                    System.out.println("The first box is larger than the second one");
                }
                else {
                    System.out.println("Boxes are incomparable");
                }
            }
        }
    }
}
