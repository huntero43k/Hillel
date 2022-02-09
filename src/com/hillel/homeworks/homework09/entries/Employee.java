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
    final private int age;

    public Employee(String name, String lastname, Date dayOfBirth, Date hiringDate) {
        this.name = name;
        this.lastname = lastname;
        this.dayOfBirth = dayOfBirth;
        this.hiringDate = hiringDate;
        this.holidaysSum = setUpHolidaysCount();
        this.age = getAge();
        this.holidaysAlreadyTaken = setUpHolidaysAlreadyTaken();
        this.holidaysLeft = setUpHolidaysLeft();
    }

    public int getAge() {
        return (int)((DateCalc.calcDaysBetweenTwoDate(this.dayOfBirth, Date.today)) / 365.25);
    }
    private int setUpHolidaysCount() {
        return (int)(DateCalc.calcMonthsBetweenTwoDate(this.hiringDate) * 2.5 + addVacationBenefits());
    }
    private int setUpHolidaysAlreadyTaken() {
        return 0;
    }
    private int setUpHolidaysLeft() {
        return this.holidaysLeft = this.holidaysSum - this.holidaysAlreadyTaken;
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
    public int getHolidaysSum() {
        return holidaysSum;
    }
    public int getHolidaysLeft() {
        return holidaysLeft;
    }

    // take vacation
    public void takeVacation(int newVacation) {
        if (newVacation < this.holidaysLeft) {
            this.holidaysAlreadyTaken = this.holidaysAlreadyTaken + newVacation;
            setUpHolidaysLeft();
            System.out.println("Vacation allowed! " + "Days left: " + this.holidaysLeft);
        }
        else if (newVacation > this.holidaysLeft){
            System.out.println("Not enough vacation days! " + "Days left: " + this.holidaysLeft);
        }
    }

    // calc additional vacation days if it exists
    private int addVacationBenefits() {
        int additionalDays = 0;
        if (getAge() >= 50) {
            int yearBenefitsPlusBegin = this.dayOfBirth.y + 50;
            Date ageVacationBenefits = new Date(01,01,yearBenefitsPlusBegin);
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
        return "| full name: " + name.toUpperCase() + " " + lastname.toUpperCase() + " |"
                + "\t" + " age: " + age + " |"
                + "\t" + "vacation left: " + holidaysLeft + " |";
    }

}