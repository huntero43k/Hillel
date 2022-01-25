package com.hillel.Temp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)  {
        Date firstDate = new Date("23 02 1990");
        Date secondDate = new Date("23 01 2022");

        LocalDate date1 = (Date.format(firstDate.date));
        LocalDate date2 = (Date.format(secondDate.date));

        System.out.println(DateCalculator.calculateNumberOfDaysBetweenTwoDate(date1, date2));

    }
}
