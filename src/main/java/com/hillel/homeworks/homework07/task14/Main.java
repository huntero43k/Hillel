package com.hillel.homeworks.homework07.task14;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String result = isPointInSquare(x, y) ? "YES" : "NO";
        System.out.println(result);
    }

    public static boolean isPointInSquare(double x, double y) {
        return (Math.abs(x) <= 1 && Math.abs(y) <= 1);
    }

}