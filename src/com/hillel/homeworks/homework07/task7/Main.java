package com.hillel.homeworks.homework07.task7;
// делал не сам, нашел подсказки
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double b1 = b / a;          //x^2-x-2=0
        double c1 = c / a;          //(x-1/2)^2-2-1/4=0
        double b2 = b1 / 2;         //(x-0.5)=2.25
        double c2 = -c1 + b2 * b2;  //x-0.5=+-1.5
        if (c2 == 0) {
            System.out.println(-b2);
        } else {
            if (c2 > 0) {
                System.out.println((-Math.sqrt(c2)-b2) + " " + (Math.sqrt(c2)-b2));
            }
        }
    }
}
