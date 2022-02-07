package com.hillel.homeworks.homework09.utils;

public class DateCalc {

    // sum of all leap days before input date
    static int calcLeapDaysSum(Date date) {
        int leapDays = 0;
        int tempYear = date.y;
        if (date.m <= 2) {          // check if current input date not bigger for month 2 (leap day include chance)
            tempYear--;             //
        }
        //count all leap days
        for (int i = 1; i <= date.y ; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                leapDays++;
            }
        }
        return leapDays;
    }

    // method counts difference between two dates
    public static int calcDaysBetweenTwoDate (Date date1, Date date2) {
        if (!Date.isValidDate(date1) || !Date.isValidDate(date2)) {
            try {
                throw new Exception("The entered DATE does NOT EXIST!");
            } catch (Exception e) {
                e.printStackTrace();
            } System.exit(0);                 // throw exception and exit program if date is incorrect
        }

        int x1 = date1.y * 365 + date1.d;           // sum daysInYears + days
        for (int i = 0; i < date1.m - 1; i++) {     // sum x1 + daysInMoths
            x1 += Date.daysInMonth[i];
        }
        x1 += calcLeapDaysSum(date1);               // final sum of x1 + allLeapYearsDays = days in date 1

        int x2 = date2.y * 365 + date2.d;           // sum daysInYears + days
        for (int i = 0; i < date2.m - 1; i++) {     // sum x1 + daysInMoths
            x2 += Date.daysInMonth[i];
        }
        x2 += calcLeapDaysSum(date2);               // final sum of x1 + allLeapYearsDays = days in date 1

        if (x1 > x2) {                              // return difference
            return x1 - x2;                         // with a larger date check so as not to get a negative number
        } else {
            return x2 - x1;
        }
    }
}