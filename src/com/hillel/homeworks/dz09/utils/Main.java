package com.hillel.homeworks.dz09.utils;

public class Main {
    public static void main(String[] args) {

        Date date1 = new Date(23, 02, 1990);
        Date date2 = new Date(03, 02, 2022);

        Date date3 = new Date("23/02/1990");
        Date date4 = new Date("03/02/2022");

        //System.out.println("date1 exists: " + Date.isValidDate(date1) + "\n" + "date2 exists: " + Date.isValidDate(date2));

        System.out.println("Difference between two dates are (in days INT): " + "\n" +
                DateCalculator.calculateNumberOfDaysBetweenTwoDate(date1, date2));
        System.out.println(date1);
        System.out.println(date2);

        System.out.println("Difference between two dates are (in days INT): " + "\n" +
                DateCalculator.calculateNumberOfDaysBetweenTwoDate(date3, date4));
        System.out.println(date3);
        System.out.println(date4);
    }
}