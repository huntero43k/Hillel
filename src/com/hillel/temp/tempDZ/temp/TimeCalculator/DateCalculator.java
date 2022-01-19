package com.hillel.temp.tempDZ.temp.TimeCalculator;

public class DateCalculator {

    // Counts number of leap years before given date
    public static int countLeapYears(Date date) {
        int years = date.year;

        // Check if the current year needs to be considered
        // for the count of leap years or not
        if (date.month <= 2)
        {
            years--;
        }

        // Year is a leap year if it is a multiple of 4,
        // multiple of 400 and not a multiple of 100.
        return years / 4 - years / 100 + years / 400;
    }


    // Return number of days between two given dates
    public static int getDifference(Date date1, Date date2)
    {
        // COUNT TOTAL NUMBER OF DAYS BEFORE FIRST DATE 'date1'

        // initialize count using years and day
        int n1 = date1.year * 365 + date1.day;

        // Add days for months in given date
        for (int i = 0; i < date1.month - 1; i++)
        {
            n1 = n1 + Date.daysInAMonth[i];
        }

        // Since every leap year is of 366 days,
        // Add a day for every leap year
        n1 = n1 + countLeapYears(date1);

        // SIMILARLY, COUNT TOTAL NUMBER OF DAYS BEFORE 'date2'
        int n2 = date2.year * 365 + date2.day;
        for (int i = 0; i < date2.month - 1; i++)
        {
            n2 = n2 + Date.daysInAMonth[i];
        }
        n2 = n2 + countLeapYears(date2);

        // return difference between two counts
        return (n2 - n1);
    }

}
