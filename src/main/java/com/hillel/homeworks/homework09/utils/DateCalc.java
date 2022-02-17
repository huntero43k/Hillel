package com.hillel.homeworks.homework09.utils;
/************************************************************************************************
 * The class was designed to create various methods for calculating various kinds of dates      *
 * It is an addition to the @Date class.                                                        *                                      *
 * The class contains different custom methods:                                                 *
 * @see #calcDaysBetweenTwoDate(Date, Date) method calclulate difference between two dates      *
 * @see #calcLeapDaysSum(Date) is a helper method for #calcDaysBetweenTwoDate() method          *
 * @see #calcMonthsBetweenTodayDate(Date) calculates difference between a random date and today *
 * @see #calcAge(Date) method determines calendar age                                           *
 ***********************************************************************************************/

public class DateCalc {

    /**
     * This method calculates the sum of leap days from the beginning of common era to the specified date
     * @param date takes input date
     * @return the sum of leap days
     */
    // sum of all leap days before input date
    static int calcLeapDaysSum(Date date) {
        int leapDays = 0;
        int tempYear = date.getY();
        if (date.getM() <= 2) {          // check if current input date not bigger for month 2 (leap day include chance)
            tempYear--;                  // temp value for year calculating
        }
        //count all leap days
        for (int i = 1; i <= date.getY() ; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                leapDays++;
            }
        }
        return leapDays;
    }

    /**
     *  This method counts difference between two dates.
     *  It consists of:
     *          - difference between dates (without leap days counting)
     *          - difference between the sums of leap days in this dates
     * @param date1 input value Date date1
     * @param date2 input value Date date2
     * @return result integer value of difference between date2 and date1, if date2 > date1 then returns
     * difference between date1 and date2.
     * @see #calcLeapDaysSum(Date) used for help of calclulating
     */
    public static int calcDaysBetweenTwoDate (Date date1, Date date2) {
        if (!Date.isValidDate(date1) || !Date.isValidDate(date2)) {
            try {
                throw new Exception("The entered DATE does NOT EXIST!");
            } catch (Exception e) {
                e.printStackTrace();
            } System.exit(0);                 // throw exception and exit program if date is incorrect
        }

        int x1 = date1.getY() * 365 + date1.getD();           // sum daysInYears + days
        for (int i = 0; i < date1.getM() - 1; i++) {     // sum x1 + daysInMoths
            x1 += Date.daysInMonth[i];
        }
        x1 += calcLeapDaysSum(date1);               // final sum of x1 + allLeapYearsDays = days in date 1

        int x2 = date2.getY() * 365 + date2.getD();           // sum daysInYears + days
        for (int i = 0; i < date2.getM() - 1; i++) {     // sum x1 + daysInMoths
            x2 += Date.daysInMonth[i];
        }
        x2 += calcLeapDaysSum(date2);               // final sum of x1 + allLeapYearsDays = days in date 1

        if (x1 > x2) {                              // return difference
            return x1 - x2;                         // with a larger date check so as not to get a negative number
        } else {
            return x2 - x1;
        }
    }

    /**
     * WARNING! This custom method is NOT RECOMMENDED due to the inaccuracy of fractional numbers.
     * (it's better to use existing classes and methods such as LocalDate, Date and others...)
     *
     * This method calculates difference between a random date and today
     * @param date input value Date date
     * @return result integer value
     *
     * Value 30.436875 - is the correct number of days in decimal format, taking into account all the leap year rules.
     * That is exactly 2629746 seconds. Converted to the minutes, hours and days we get the above figures.
     */
    public static int calcMonthsBetweenTodayDate(Date date) {
        return (int)Math.floor(calcDaysBetweenTwoDate(date, Date.today) / 30.436875);
    }

    /**
     * This method calculates the calendar age.
     * @param dayOfBirth input value Date date where date is a dayOfBirth
     * @return result integer value (age)
     */
    public static int calcAge(Date dayOfBirth) {
        return (int)((DateCalc.calcDaysBetweenTwoDate(dayOfBirth, Date.today)) / 365.242375);
    }

}