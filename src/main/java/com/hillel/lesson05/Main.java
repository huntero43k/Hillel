package com.hillel.lesson05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Choose operation:");
        System.out.println("1 - ADD\n2 - MINUS\n3 - DIVISION\n4 - MULTIPLICATION");

        var x = console.nextLine();

        if (x.equals("1")) {
            System.out.println("Calculate ADD for 2 digits:");
            add(console.nextDouble(), console.nextDouble());
        }
        else if (x.equals("2")) {
            System.out.println("Calculate MINUS for 2 digits:");
//            minus(console.nextDouble(), console.nextDouble());
        }
        else if (x.equals("3")) {
            System.out.println("Calculate DIVISION for 2 digits:");
            division(console.nextDouble(), console.nextDouble());
        }
        else if (x.equals("4")) {
            System.out.println("Calculate MULTIPLICATION for 2 digits:");
            multiplication(console.nextDouble(), console.nextDouble());
        }
        else if (x.equalsIgnoreCase("exit")) {

        }

    }
    public static void add(double a, double b) {
        System.out.println(a + b);
    }
//    public static double minus(double a, double b) {
//        System.out.println(a - b);
//    }

    public static void division (double a, double b) {
        System.out.println(a / b);
    }
    public static void multiplication (double a, double b) {
        System.out.println(a * b);
    }

}
