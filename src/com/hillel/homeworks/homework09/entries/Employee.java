package com.hillel.homeworks.homework09.entries;

import com.hillel.homeworks.homework09.utils.Date;
import com.hillel.homeworks.homework09.utils.DateCalc;

abstract public class Employee {

    private String name;
    private String lastname;
    private Date dayOfBirth;
    private Date hiringDate;
    private int holidaysAlreadyTaken;
    final private int holidaysSum;
    private int holidaysLeft;

    public Employee(String name, String lastname, Date dayOfBirth, Date hiringDate) {
        this.name = name;
        this.lastname = lastname;
        this.dayOfBirth = dayOfBirth;
        this.hiringDate = hiringDate;
        this.holidaysSum = setUpHolidaysCount();
        int age = getAge();
        this.holidaysAlreadyTaken = setUpHolidaysAlreadyTaken();
        this.holidaysLeft = setUpHolidaysLeft();
    }
    // variable setUpHolidaysCount initialise
    private int setUpHolidaysCount() {
        return (int)(DateCalc.calcMonthsBetweenTwoDate(this.hiringDate) * 2.5 + addVacationBenefits());
    }
    // variable setUpHolidaysAlreadyTaken default initialise
    private int setUpHolidaysAlreadyTaken() {
        return 0;
    }
    // count holidays
    private int setUpHolidaysLeft() {
        return this.holidaysLeft = this.holidaysSum - this.holidaysAlreadyTaken;
    }
    // get Age
    public int getAge() {
        return (int)((DateCalc.calcDaysBetweenTwoDate(this.dayOfBirth, Date.today)) / 365.25);
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
        if (getAge() >= 50) {
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

    // setters & getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Date getDayOfBirth() {
        return dayOfBirth;
    }
    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
    public Date getHiringDate() {
        return hiringDate;
    }
    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }
    public int getHolidaysAlreadyTaken() {
        return holidaysAlreadyTaken;
    }
    public void setHolidaysAlreadyTaken(int holidaysAlreadyTaken) {
        this.holidaysAlreadyTaken = holidaysAlreadyTaken;
    }
    public int getHolidaysSum() {
        return holidaysSum;
    }
    public int getHolidaysLeft() {
        return holidaysLeft;
    }

    // display all necessary information about an employee
    public String toString() {
        return "| FULL_NAME: " + getName() + " " + getLastname() + " |"
                + "\t" + "AGE: " + getAge() + " |"
                + "\t" + "VACATION_LEFT: " + getHolidaysLeft() + " |";
    }

}