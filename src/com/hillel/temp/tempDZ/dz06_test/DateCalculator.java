package com.hillel.temp.tempDZ.dz06_test;

public class DateCalculator {
    // Array with days of all months from January to December
    final static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Check if input date exist
    static public boolean dateExistenceCheck(Date date) {

        if ((date.m >= 1 && date.m <= 12) &&
                (date.d >= daysInMonth[date.m - 1] && date.d <= daysInMonth[date.m - 1]) &&
                date.y > 0) {
            return true;
        } else if ((((date.y % 4 == 0 && date.y % 100 != 0) || date.y % 400 == 0)) &&
                ((date.m == 2) && (date.d >= 1 && date.d <= 29))) {
            return true;
        } else {
            return false;
        }
    }


    // small double date exist check
    static public void checkDates(Date date) {
        if (!dateExistenceCheck(date))
        try {
            throw new Exception("Date entered incorrectly!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);

    }

    // Count a number of leap years before input date
    static public int leapYearCheck(Date date) {
        int count = 0;

        if (date.m <= 2) {      // check if current input date not bigger for month 2
            date.y--;           // because of probability of leap year include
        }

        //count all leap days
        for (int i = 1; i <= date.y ; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                count++;
            }
        }
        return count;
    }

    // function that counts difference between two dates
    static int calculateNumberOfDaysBetweenTwoDate (Date date1, Date date2) {

        checkDates(date1);
        checkDates(date2);

        int x1 = date1.y * 365 + date1.d;       // sum daysInYears + days

        for (int i = 0; i < date1.m; i++) {     // sum x1 + daysInMoths
            x1 += daysInMonth[i];
        }
        x1 += leapYearCheck(date1);             // final sum of x1 + allLeapYearsDays = days in date 1

        int x2 = date2.y * 365 + date2.d;       // sum daysInYears + days

        for (int i = 0; i < date2.m; i++) {     // sum x1 + daysInMoths
            x2 += daysInMonth[i];
        }
        x2 += leapYearCheck(date2);             // final sum of x1 + allLeapYearsDays = days in date 1

        if (x2 > x1) {                          // return difference
            return x2 - x1;
        } else {
            return x1 - x2;
        }
    }

}