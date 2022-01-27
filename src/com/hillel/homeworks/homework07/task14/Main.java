package com.hillel.homeworks.homework07.task14;
// 0 -1, -1 0, 0 0
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if (isPointInSquare(x,y)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPointInSquare(double x, double y) {
        return (x * x + y * y <= Math.pow(2, (1 / 2)));
    }

}