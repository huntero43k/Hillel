package com.hillel.temp.tempDZ.temp.dz06_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date1 = new Date(23, 2, 1990);
        Date date2 = new Date(19,1,2022);
        int result = DateCalculator.sumAllDaysBetween(date1,date2) - DateCalculator.restDaysInYear(date1) - DateCalculator.restDaysInYear(date2);
        System.out.println(DateCalculator.sumAllDaysBetween(date1, date2));
        System.out.println(DateCalculator.restDaysInYear(date1));
        System.out.println(DateCalculator.restDaysInYear(date2));
        System.out.println(result - 365);

    }
}
