package com.hillel.homeworks.dz09.utils;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Date date1 = new Date(23, 02, 1990);
        Date date2 = new Date(03, 02, 2022);

        Date date3 = new Date("23/02/1990");
        Date date4 = new Date("03/02/2022");

        Date now = new Date(LocalDate.now().getDayOfMonth(),
                LocalDate.now().getMonthValue(),
                LocalDate.now().getYear());

        //System.out.println("date1 exists: " + Date.isValidDate(date1) + "\n" + "date2 exists: " + Date.isValidDate(date2));

        System.out.println("Difference between two dates are (in days INT): " + "\n" +
                DateCalc.calcDaysBetweenTwoDate(date1, date2));
        System.out.println(date1);
        System.out.println(date2);

        System.out.println("Difference between two dates are (in days INT): " + "\n" +
                DateCalc.calcDaysBetweenTwoDate(date3, date4));
        System.out.println(date3);
        System.out.println(date4);
        System.out.println("--------------------------");
        System.out.println(now);
    }
}