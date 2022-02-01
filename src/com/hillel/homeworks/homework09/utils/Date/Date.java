package com.hillel.homeworks.homework09.utils.Date;

import java.time.LocalDate;

public class Date {
    int d;    // day
    int m;    // month
    int y;    // year

    // number of days in each month
    final static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    // dynamic today's date
    final static Date today = new Date(LocalDate.now().getDayOfYear(),
                                       LocalDate.now().getMonthValue(),
                                       LocalDate.now().getYear());

    Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    // print date in EU format
    public static void printDate(Date date) {
        if (date.d < 10 && date.m < 10) {
            System.out.println("0" + date.d + "." + "0" + date.m + "." + date.y);
        } else if (date.d < 10) {
            System.out.println("0" + date.d + "." + date.m + "." + date.y);
        } else if (date.m < 10) {
            System.out.println(date.d + "." + "0" + date.m + "." + date.y);
        } else {
            System.out.println(date.d + "." + date.m + "." + date.y);
        }
    }

    // check if a year is a leap year
    static boolean isLeapYear (Date date) {
        return  date.y % 400 == 0 || (date.y % 4 == 0 && date.y % 100 != 0);
    }

    // check if date is exists
    static boolean isValidDate (Date date) {
        if (date.d < 1 || date.m < 1 || date.y < 1 || date.m > 12) {    // date range input test
            return false;
        } else if (date.m == 2 && !isLeapYear(date) && date.d <= 28) {  // if not leap year February have 28 days
            return true;
        } else if (date.m == 2 && isLeapYear(date) && date.d <= 29) {   // if leap year February have 29 days
            return true;
        } else if (date.d <= daysInMonth[date.m - 1]) {
            return true;
        }
        return false;
    }

}