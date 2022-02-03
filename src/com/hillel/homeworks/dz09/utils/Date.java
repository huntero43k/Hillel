package com.hillel.homeworks.dz09.utils;

import java.time.LocalDate;

public class Date {
    final public int d;     // day
    final public int m;     // month
    final public int y;     // year

    // number of days in each month
    final public static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // dynamic today's Date
    final public static Date today = new Date(LocalDate.now().getDayOfMonth(),
                                       LocalDate.now().getMonthValue(),
                                       LocalDate.now().getYear());

    // int constructor
    Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    // String constructor
    Date(String date){
        String[] values = date.split("/");
        this.d = Integer.parseInt(values[0]);
        this.m = Integer.parseInt(values[1]);
        this.y = Integer.parseInt(values[2]);
    }

    @Override
    public String toString() {
        return d + "/" + m + "/" + y;
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