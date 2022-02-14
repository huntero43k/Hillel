package com.hillel.lesson03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        n = f(n);
        System.out.println("N = " + n);
    }
    public static int f(int x) {
        return (x + 1) * 10;
    }
}
