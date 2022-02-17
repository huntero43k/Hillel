package com.hillel.homeworks.homework09.utils;
/************************************************************************************************
 * This class was created to work with date objects                                             *
 *                                                                                              *
 * The class contains:                                                                          *
 * ■ Private data fields: d, m, y, int[] daysInMonth, Date today                                *
 * ■ Two constructors with different input types: (int d, int m, int y) and (String date)       *
 * ■ All getters and setters are implemented through lombok.                                    *
 * ■ A method named isLeapYear() is used to check that the year is a leap year.                 *
 * ■ A method isValidDate() is used to check for the date existing.                             *
 ***********************************************************************************************/
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter(AccessLevel.PROTECTED)
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Date {
    /**
     * This is fields where we will store our values:
     * @see #d - is a day
     * @see #m - is a month
     * @see #y - is a year
     * @see #daysInMonth - is an array that stores the number of days in each month
     * @see #today - dynamic date which always displays today's calendar date (helper class LocalDate used)
     */
    int d;
    int m;
    int y;
    protected static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static Date today = new Date(LocalDate.now().getDayOfMonth(),
                                            LocalDate.now().getMonthValue(),
                                            LocalDate.now().getYear());

    /**
     * This is an integer constructor to initialize Date objects
     * @param d is a day value
     * @param m is a month value
     * @param y is a year value
     */
    public Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    /**
     * This is a String constructor to initialize Date objects.
     * As a result returns the integer value of day, month and year for the future calculating.
     * @param date accept date in format dd.MM.yyyy
     */
    public Date(String date){
        String[] values = date.split("\\.");
        this.d = Integer.parseInt(values[0]);
        this.m = Integer.parseInt(values[1]);
        this.y = Integer.parseInt(values[2]);
    }

    /**
     * This method check if a year is a leap year by the following criteria:
     *      - leap year is perfectly divisible by 400
     *      - not a leap year if divisible by 100 but not divisible by 400
     *      - leap year if not divisible by 100 but divisible by 4
     *      - all other years are not leap years
     * @param date takes input date
     * @return true or false depending on the check that the year is a leap year
     */
    // check if a year is a leap year
    static boolean isLeapYear (Date date) {
        return  date.getY() % 400 == 0 || (date.getY() % 4 == 0 && date.getY() % 100 != 0);
    }

    /**
     * This method checks for the existence of a date
     * @param date is an input date for check
     * @return true or false depending on the check that the date is exists
     * @see #isLeapYear(Date) helps to find February maximum days value
     */
    // check if date is exists
    public static boolean isValidDate (Date date) {
        if (date.getD() < 1 || date.getM() < 1 || date.getY() < 1 || date.getM() > 12) {    //days range check
            return false;
        } else if (date.getM() == 2 && !isLeapYear(date) && date.getD() <= 28) {  //if not leap year, February = 28 days
            return true;
        } else if (date.getM() == 2 && isLeapYear(date) && date.getD() <= 29) {   //if leap year, February = 29 days
            return true;
        } else if (date.getD() <= daysInMonth[date.getM() - 1]) {   // check if a date exists in a specific month
            return true;
        }
        return false;
    }

    /**
     * Overridden method toString that displays the main properties of our object in the form we need.
     * If day or month value >=1 && <=9 then add "0" before, for nice displaying
     */
    @Override
    public String toString() {
        if ((getD() >= 1 && getD() <= 9) && (getM() >= 1 && getM() <= 9)) {
            return "0" + getD() + "." + "0" + getM() + "." + getY();
        }
        else if ((getD() >= 1 && getD() <= 9) && (getM() > 9)) {
            return "0" + getD() + "." + getM() + "." + getY();
        }
        else if ((getD() > 9) && (getM() >= 1 && getM() <= 9)) {
            return getD() + "." + "0" + getM() + "." + getY();
        }
        else return getD() + "." + getM() + "." + getY();
    }

}