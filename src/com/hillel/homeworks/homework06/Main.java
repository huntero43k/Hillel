package com.hillel.homeworks.homework06;

public class Main {
    public static void main(String[] args) {

        Date date1 = new Date(23, 2, 1990);
        Date date2 = new Date(3, 2, 2022);

        //System.out.println("date1 exists: " + Date.isValidDate(date1) + "\n" + "date2 exists: " + Date.isValidDate(date2));

        System.out.println("Difference between two dates are (in days): " + "\n" +
                DateCalculator.calculateNumberOfDaysBetweenTwoDate(date1, date2));
    }
}