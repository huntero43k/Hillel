package com.hillel.homeworks.homework07.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println((int) ((x * 10) % 10));
    }
}