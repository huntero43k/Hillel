package com.hillel.homework.dz06;

public class DateCalculator {
    // Array with days of all months from January to December
    static int [] daysInAMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Count a number of leap years before given date
    static int countLeapYears(Date date) {
        int years = date.y;

        if (date.m <= 2)        // check if current input date not bigger for month 2
            years--;            // because of probability of leap year include

        //count all leap days from 00-00-0000 to date XX-XX-XXXX
        return years / 4 - years / 100 + years / 400;
    }

    // calculate difference between two dates
    static int calculateNumberOfDaysBetweenTwoDate(Date date1, Date date2) {
        // count all days of date1
        int x1 = date1.y * 365 + date1.d;
        for (int i = 0; i < date1.m - 1; i++) {
            x1 += daysInAMonths[i];
        }
        x1 += countLeapYears(date1); // add all leap days

        // count all days of date2
        int x2 = date2.y * 365 + date2.d;
        for (int i = 0; i < date2.m -1; i++) {
            x2 += daysInAMonths[i];
        }
        x2 += countLeapYears(date2); // add all leap days

        //return a difference
        return x2 - x1;
    }
}
