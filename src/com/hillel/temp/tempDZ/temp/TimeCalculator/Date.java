package com.hillel.temp.tempDZ.temp.TimeCalculator;

// class Date has day, month, year
public class Date {
    int day;
    int month;
    int year;
    public static int[] daysInAMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    // getters
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

}
