package com.hillel.lesson04;
//by Artem
import java.util.Scanner;

public class Temp04_1 {
    public static void main(String[] args) {
        System.out.println("N");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        for (i = 1; i * i <= n ; i++) {
            System.out.print(i * i + " "); }
    }
}
