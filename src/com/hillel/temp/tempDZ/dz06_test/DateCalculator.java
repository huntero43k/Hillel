package com.hillel.temp.tempDZ.dz06_test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateCalculator {
    // Array with days of all months from January to December
    final static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

//    // Check if a date exists or not
//    public static boolean isValidDate(Date date) {
//        String formatString = "dd/MM/YYYY";
//
//        try {
//            SimpleDateFormat format = new SimpleDateFormat(formatString);
//            format.setLenient(false);
//            format.parse(date.toString());
//        } catch (ParseException e) {
//            return false;
//        } catch (IllegalArgumentException e) {
//            return false;
//        }
//
//        return true;
//    }
    // Checking  for leap year
    static boolean isLeapYear (Date date) {
        if (date.y % 400 == 0) {
            return true;
        } else if (date.y % 100 == 0) {
            return false;
        } else {
            return date.y % 4 == 0;
        }
    }

    // Check if a date exists or not
//    static boolean isValidDate(Date date) {
//        if (date.d < 1)
//    }

    // Check if input date exist
//    static boolean dateExistenceCheck(Date date) {
//
//        if ((date.m >= 1 && date.m <= 12) &&
//                (date.d >= daysInMonth[date.m - 1] && date.d <= daysInMonth[date.m - 1]) &&
//                date.y > 0) {
//            return true;
//        } else if ((((date.y % 4 == 0 && date.y % 100 != 0) || date.y % 400 == 0)) &&
//                ((date.m == 2) && (date.d >= 1 && date.d <= 29))) {
//            return true;
//        } else {
//            return false;
//        }
//    }



    // small date exist check
//    static public void checkDates(Date date) {
//        while (!isValidDate(date))
//        try {
//            throw new Exception("Date entered incorrectly!");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        checkDates(date);
//    }

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

//        isValidDate(date1);
//        isValidDate(date2);

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