package com.hillel.temp.tempDZ.temp.TimeCalculator;


public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(23, 2, 1990);
        Date date2 = new Date(19, 1, 2022);
        System.out.println(DateCalculator.getDifference(date1, date2));

    }
}