package com.hillel.temp.tempDZ.dz06_test;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(23, 2, 1990);
        Date date2 = new Date(19,1,2022);
        System.out.println(DateCalculator.isLeapYear(date1));
        System.out.println(DateCalculator.isLeapYear(date2));
//        System.out.println(DateCalculator.isValidDate(date1));
        System.out.println(DateCalculator.calculateNumberOfDaysBetweenTwoDate(date1, date2));

    }
}
