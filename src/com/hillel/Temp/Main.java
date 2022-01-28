package com.hillel.Temp;

public class Main {
    public static void main(String[] args)  {
        Date firstDate = new Date("23 02 1990");
        Date secondDate = new Date("23 01 2022");

        System.out.println(DateCalculator.calculateNumberOfDaysBetweenTwoDate(firstDate, secondDate));

    }
}