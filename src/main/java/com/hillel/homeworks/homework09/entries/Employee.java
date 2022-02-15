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

    final String name;
    final String lastname;
    final Date dayOfBirth;
    final Date hiringDate;
    int holidaysAlreadyTaken;
    int holidaysSum;
    int holidaysLeft;
    int age;

    /**
     * This is a constructor to initialize employee's objects.
     * @param name an initial employee name
     * @param lastname an initial employee lastname
     * @param dayOfBirth this is the employee's date of birth
     * @param hiringDate this is the date of hire
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
     * This method calculates the total vacation days of Employee.
     * The logic of the method includes 3 main points:
     * 1) The method calculates the total number of months worked by an employee, starting from
     *                   the hiring date (the utils Class DateCalc is used for calculating);
     * 2) Then it adds 2.5 vacation days every month (assuming 30 days per year);
     * 3) Also adds "benefits" days, if they exist, to the total number of days,
     *                   helper method addVacationBenefits() is used (method description below);
     */
    private void setHolidaysSum(Date hiringDate) {
        this.holidaysSum = (int)(DateCalc.calcMonthsBetweenTwoDate(hiringDate) * 2.5 + addVacationBenefits());
    }

    /**
     * Sets the age of the employee
     * @param dayOfBirth accepted as input
     * helper method DateCalc.calcAge() is used
     */
    private void setAge(Date dayOfBirth) {
        this.age = DateCalc.calcAge(dayOfBirth);
    }

    /**
     * Sets the initial value to initialize the variable
     */
    private void setHolidaysAlreadyTaken() {
        this.holidaysAlreadyTaken = 0;
    }

    /**
     * The method calculates the number of vacation days left using known variables such as:
     * holidaysAlreadyTaken, holidaysAlreadyTaken
     */
    private void setHolidaysLeft() {
        this.holidaysLeft = this.holidaysSum - this.holidaysAlreadyTaken;
    }

    /**
     *
     * @param date1
     * @param date2
     */
    // take vacation (Date range FROM dd.MM.yyyy - TO dd.MM.yyyy)
    public void takeVacation(Date date1, Date date2) {
        int newHoliday = DateCalc.calcDaysBetweenTwoDate(date1, date2);
        if (newHoliday <= getHolidaysLeft() && newHoliday >= 0) {
            this.holidaysAlreadyTaken = getHolidaysAlreadyTaken() + newHoliday;
            setHolidaysLeft();
            System.out.println("The next vacation will last: " + newHoliday + " day(s)");
            System.out.println("Vacation allowed! " + "Days left: " + getHolidaysLeft());
        }
        else if (newHoliday < 0) {
            System.out.println("Vacation can't be negative number! " + "Days left: " + getHolidaysLeft());
        } else {
            System.out.println("Not enough vacation days! " + "Days left: " + getHolidaysLeft());
        }
    }

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

    // add additional vacation days if employee age > 50
    private int addVacationBenefits() {
        int additionalDays = 0;
        if (this.age >= 50) {
            int yearBenefitsPlusBegin = getDayOfBirth().y + 50;
            if (yearBenefitsPlusBegin < getHiringDate().y) {
                yearBenefitsPlusBegin = getHiringDate().y;
            }
            Date ageVacationBenefits = new Date(1,1,yearBenefitsPlusBegin);
            int monthsWorkedAfter = DateCalc.calcMonthsBetweenTwoDate(ageVacationBenefits);
            for (int i = 1; i < monthsWorkedAfter; i++) {
                if (i == 1 || i % 13 == 0) {
                    additionalDays += 2;
                }
            }
        }
        return additionalDays;
    }

    // display all necessary information about an employee
    public String toString() {
        return "| FULL_NAME: " + getName() + " " + getLastname() + " |"
                + "\t" + "AGE: " + getAge() + " |"
                + "\t" + "VACATION_LEFT: " + getHolidaysLeft() + " |";
    }

}