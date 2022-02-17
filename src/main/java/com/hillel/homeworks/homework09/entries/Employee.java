package com.hillel.homeworks.homework09.entries;
/************************************************************************************************
 * This program can be used for staff holiday management                                        *
 *                                                                                              *
 * The class contains:                                                                          *
 * ■ Private data fields: name, lastname, dayOfBirth, hiringDate, holidaysAlreadyTaken,         *
 *                        holidaysSum, holidaysLeft.                                            *
 * ■ A constructor with the arguments for name, lastname, dayOfBirth and hiringDate.            *
 * ■ All getters are implemented through lombok.                                                *
 * ■ All setters are custom methods that return the result of vacation counting using input data*
 * ■ A method named takeVacation() method is used to grant vacation and count remaining days.   *
 * ■ A method addVacationBenefits() calc additional vacation days if employee age is > 50 years.*
 *                                                                                              *
 * This program takes standard employee input and returns the result of a calculation that      *
 * provides vacation count functionality.                                                       *
 ***********************************************************************************************/

import com.hillel.homeworks.homework09.utils.Date;
import com.hillel.homeworks.homework09.utils.DateCalc;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
abstract public class Employee {

    /**
     * This is fields where we will store our values
     */
    final String name;
    final String lastname;
    final Date dayOfBirth;
    final Date hiringDate;
    int holidaysAlreadyTaken;
    int holidaysSum;
    int holidaysLeft;
    int age;

    /**
     * This is a constructor for the class inheritor.
     * @param name set an initial employee name
     * @param lastname set an initial employee lastname
     * @param dayOfBirth set employee's date of birth
     * @param hiringDate set the date of hire
     * other variables have automatic calculating and value assignment
     */
    public Employee(String name, String lastname, Date dayOfBirth, Date hiringDate) {
        this.name = name;
        this.lastname = lastname;
        this.dayOfBirth = dayOfBirth;
        this.hiringDate = hiringDate;
        setAge(dayOfBirth);
        setHolidaysSum(hiringDate);
        setHolidaysAlreadyTaken();
        setHolidaysLeft();
    }

    // setters & getters
    /**
     * Calculates the total amount of employee's vacation days
     * @param hiringDate accepted as input
     *
     * This method calculates the total vacation days of employee.
     * The logic of the method includes 3 main points:
     * 1) The method calculates the total number of months worked by an employee, starting from
     *                   the hiring date (DateCalc.calcMonthsBetweenTwoDate() is used for calculating);
     *                   @see DateCalc#calcMonthsBetweenTwoDate(Date) 
     * 2) This method adds 2.5 vacation days every month (assuming 30 days per year)
     *                   (returns an integer by using TypeCasting);
     * 3) Also adds "benefits" days, if they exist, to the total number of days,
     *                   @see #addVacationBenefits() - a helper method is used ;
     *  
     */
    private void setHolidaysSum(Date hiringDate) {
        this.holidaysSum = (int)(DateCalc.calcMonthsBetweenTwoDate(hiringDate) * 2.5 + addVacationBenefits());
    }

    /**
     * Sets the age of the employee
     * @param dayOfBirth accepted as input
     * @see DateCalc#calcAge(Date) helper method is used
     */
    private void setAge(Date dayOfBirth) {
        this.age = DateCalc.calcAge(dayOfBirth);
    }

    /**
     * Sets the initial value to initialize the variable holidaysAlreadyTaken
     */
    private void setHolidaysAlreadyTaken() {
        this.holidaysAlreadyTaken = 0;
    }

    /**
     * The method calculates the number of vacation days left using known variables such as:
     * holidaysSum, holidaysAlreadyTaken
     * This method returns value of int holidaysLeft
     */
    private void setHolidaysLeft() {
        this.holidaysLeft = this.holidaysSum - this.holidaysAlreadyTaken;
    }

    /**
     * ■ The method takes input data, using 2 dates. It counts holidays left and next vacation days sum.
     * ■ This method return value of the remaining vacation days and outputs information to the console:
     *              - next vacation information;
     *              - holidays left (in days);
     * ■ This method contains small checks for the negative value and exceeding the limit
     * of the remaining vacation days.
     * @see Date class that helps process the input data in date format
     * @see DateCalc#calcDaysBetweenTwoDate(Date, Date) count all necessary data
     * @param date1 first date of next vacation days range.
     *              (example of input parameters 24.04.2021);
     * @param date2 second date of next vacation days range.
     *              (example of input parameters 30.04.2021);
     */
    // take vacation (Date range FROM dd.MM.yyyy - TO dd.MM.yyyy)
    public void takeVacation(Date date1, Date date2) {
        int newHoliday = DateCalc.calcDaysBetweenTwoDate(date1, date2);
        if (newHoliday <= getHolidaysLeft() && newHoliday >= 0) {
            this.holidaysAlreadyTaken = getHolidaysAlreadyTaken() + newHoliday;
            setHolidaysLeft();
            System.out.println("The next vacation" + date1 + "-" + date2 + " will last: " + newHoliday + " day(s)");
            System.out.println("Vacation allowed! " + "Days left: " + getHolidaysLeft());
        }
        else if (newHoliday < 0) {
            System.out.println("Vacation can't be negative number! " + "Days left: " + getHolidaysLeft());
        } else {
            System.out.println("Not enough vacation days! " + "Days left: " + getHolidaysLeft());
        }
    }

    /**
     * Polymorphic method to the previous one. The only difference is the input data
     * @param newHoliday using for initialize already taken holidays
     */
    // take vacation (days)
    public void takeVacation(int newHoliday) {
        if (newHoliday <= getHolidaysLeft() && newHoliday >= 0) {
            this.holidaysAlreadyTaken = getHolidaysAlreadyTaken() + newHoliday;
            setHolidaysLeft();
            System.out.println("Vacation allowed! " + "Days left: " + getHolidaysLeft());
        }
        else if (newHoliday < 0) {
            System.out.println("Vacation can't be negative number! " + "Days left: " + getHolidaysLeft());
        } else {
            System.out.println("Not enough vacation days! " + "Days left: " + getHolidaysLeft());
        }
    }

    /**
     * ■ This method counts the number of additional vacation days if an employee age is 50 years or older.
     * The starting date from which the calculation of days begins is the date 01.01.yyyy, where yyyy is the
     * current calendar year are entitled to a holiday of 32 days per year. (add 2 benefit vacation days)
     * @see DateCalc#calcMonthsBetweenTwoDate(Date) 
     * ■ Small checks: to ensure that the start year of the extra days count is not less than the hire date year.
     * ■ If the age is 50+ years old and hiring date of an employee falls on 01.01.ХХХХ ()
     * than 2 benefit days of vacation are immediately issued.
     * @return additionalDays value which takes part in the setHolidaysSum() method.
     */
    // add additional vacation days if employee age is 50+
    private int addVacationBenefits() {
        int additionalDays = 0;
        if (this.age >= 50) {
            int benefitYearStart = getDayOfBirth().y + 50;
            if (benefitYearStart < getHiringDate().y) {
                benefitYearStart = getHiringDate().y;
            }
            Date benefitDateStart = new Date(1,1,benefitYearStart);
            int monthsWorkedAfter = DateCalc.calcMonthsBetweenTwoDate(benefitDateStart);
            for (int i = 1; i < monthsWorkedAfter; i++) {
                if (i == 1 || i % 13 == 0) {
                    additionalDays += 2;
                }
            }
            if (benefitDateStart.d == getHiringDate().d && benefitDateStart.m == getHiringDate().m) {
                additionalDays += 2;
            }
        }
        return additionalDays;
    }

    /**
     * Overridden method toString that displays the main properties of our object in the form we need.
     * @return display the properties of an object such as: full_name, age, vacation_days_left
     */
    // display all necessary information about an employee
    public String toString() {
        return "| FULL_NAME: " + getName() + " " + getLastname() + " |"
                + "\t" + "AGE: " + getAge() + " |"
                + "\t" + "VACATION_LEFT: " + getHolidaysLeft() + " |";
    }

}