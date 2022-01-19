package com.hillel.temp.tempDZ.temp.dz06_test;

public class DateCalculator {

    static public int sumAllDaysBetween(Date date1, Date date2) {
        int count = 0;
        int temp = 0;
        for (int i = date1.y; i <= date2.y ; i++) {
            if (date1.y % 4 == 0 && date1.y % 100 == 0 && date1.y % 400 == 0) {
                temp = 366;
            } else {
                temp = 365;
            }
            count += temp;
        }
        return count;
    }

    static int restDaysInYear (Date date) {
        int count = 0;
        int temp;
        for (int i = 0; i < date.m - 1; i++) {
            count += Date.daysInMonth[i];
        }
        count+= date.d;
        return count;
    }

}
