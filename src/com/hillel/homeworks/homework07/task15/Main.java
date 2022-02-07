package com.hillel.homeworks.homework07.task15;
// -3 -4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (isPointInArea(x, y)) {
            System.out.println("YES");;
        }
        else {
            System.out.println("NO");;
        }
    }

    public static boolean isPointInCircle(double x, double y) {
        final double xc = -1;
        final double yc = 1;
        final double r = 2;
        return (x - xc) * (x - xc) + (y - yc) * (y - yc) <= r * r;
    }

    public static boolean isPointInsideCircle(double x, double y) {
        final double xc = -1;
        final double yc = 1;
        final double r = 2;
        return (x - xc) * (x - xc) + (y - yc) * (y - yc) < r * r;
    }

    public static boolean isPointInArea(double x, double y) {
        boolean leftLineRight = (x + y >= 0);
        boolean rightLineLeft = (2 * x - y + 2 <= 0);
        boolean leftLineLeft = (x + y <= 0);
        boolean rightLineRight = (2 * x - y + 2 >= 0);
        boolean inCircleArea = isPointInCircle(x, y) && leftLineRight && rightLineLeft;
        boolean inBottom = !isPointInsideCircle(x, y) && leftLineLeft && rightLineRight;
        return inCircleArea || inBottom;
    }

}