package com.hillel.lesson03;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество метров: ");
        double f = console.nextDouble();
        f = foots(f);
        System.out.println("В футах: " + f);
        //System.out.println("В футах: " + m);

    }

    public static double foots(double x) {
        return x * 3.28084;
//    }
//    public static int millimeters (int x) {
//        return x * 1000;
//    }
    }
}

