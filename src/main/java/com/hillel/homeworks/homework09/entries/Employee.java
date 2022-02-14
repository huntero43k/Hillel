package com.hillel.homeworks.homework09.entries;
/************************************************************************************************
 * This program can be used for staff holiday management                                        *
 *                                                                                              *
 * The class contains:                                                                          *
 * ■ Private data fields: name, lastname, dayOfBirth, hiringDate, holidaysAlreadyTaken,         *
 *                        holidaysSum, holidaysLeft.                                            *
 * ■ A constructor with the arguments for name, lastname, dayOfBirth and hiringDate.            *                   *
 * ■ Six getter methods for a, b, c, d, e, and f.                                 *
 * ■ A method named isSolvable() that returns true if ad - bc is not 0.           *
 * ■ Methods getX() and getY() that return the solution for the equation.         *
 *                                                                                *
 * This program prompts the user to enter a, b, c, d, e, and f and displays the   *
 * result. If ad - bc is 0, report that “The equation has no solution.”           *
 *********************************************************************************/

import com.hillel.homeworks.homework09.utils.Date;
import com.hillel.homeworks.homework09.utils.DateCalc;

abstract public class Employee {

    final private String name;
    final private String lastname;
    final private Date dayOfBirth;
    final private Date hiringDate;
    private int holidaysAlreadyTaken;
    final private int holidaysSum;
    private int holidaysLeft;
    final private int age;

    public Employee(String name, String lastname, Date dayOfBirth, Date hiringDate) {
        this.name = name;
        this.lastname = lastname;
        this.dayOfBirth = dayOfBirth;
        this.hiringDate = hiringDate;
        this.holidaysSum = setUpHolidaysCount();
        this.age = setUpAge();
        this.holidaysAlreadyTaken = setUpHolidaysAlreadyTaken();
        this.holidaysLeft = setUpHolidaysLeft();
    }
    // counts the number of all vacation days (handles only once when initializing a new object)
    private int setUpHolidaysCount() {
        return (int)(DateCalc.calcMonthsBetweenTwoDate(this.hiringDate) * 2.5 + addVacationBenefits());
    }
    // variable setUpHolidaysAlreadyTaken default initialise by zero
    private int setUpHolidaysAlreadyTaken() {
        return 0;
    }
    // calculate holidays
    private int setUpHolidaysLeft() {
        return this.holidaysLeft = this.holidaysSum - this.holidaysAlreadyTaken;
    }
    // calculate age
    private int setUpAge() {
        return (int)((DateCalc.calcDaysBetweenTwoDate(this.dayOfBirth, Date.today)) / 365.25);
    }



    // setters & getters
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public Date getDayOfBirth() {
        return dayOfBirth;
    }
    public int getAge() {
        return age;
    }
    public Date getHiringDate() {
        return hiringDate;
    }
    public int getHolidaysLeft() {
        return holidaysLeft;
    }

    // take vacation (holiday)
    public void takeVacation(int newVacation) {
        if (newVacation <= this.holidaysLeft && newVacation >= 0) {
            this.holidaysAlreadyTaken = this.holidaysAlreadyTaken + newVacation;
            setUpHolidaysLeft();
            System.out.println("Vacation allowed! " + "Days left: " + this.holidaysLeft);
        }
        else if (newVacation < 0) {
            System.out.println("Vacation can't be negative number! " + "Days left: " + this.holidaysLeft);
        } else {
            System.out.println("Not enough vacation days! " + "Days left: " + this.holidaysLeft);
        }
    }

    // add additional vacation days if employee age > 50
    private int addVacationBenefits() {
        int additionalDays = 0;
        if (setUpAge() >= 50) {
            int yearBenefitsPlusBegin = this.dayOfBirth.y + 50;
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