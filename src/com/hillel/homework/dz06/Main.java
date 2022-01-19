package com.hillel.homework.dz06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DATE FORMAT --> DD-MM-YYYY");
        System.out.printf("Please enter your first date: \n");
        Date date1 = new Date(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.printf("Please enter your second date: \n");
        Date date2 = new Date(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(DateCalculator.calculateNumberOfDaysBetweenTwoDate(date1, date2));
    }
}
