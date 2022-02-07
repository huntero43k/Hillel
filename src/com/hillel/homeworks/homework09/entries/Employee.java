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

    public void takeVacation(int newVacation) {
        if (newVacation < this.holidaysLeft) {
            this.holidaysAlreadyTaken = this.holidaysAlreadyTaken + newVacation;
            setUpHolidaysLeft();
            System.out.println("Vacation allowed!");
            System.out.println("Days left: " + this.holidaysLeft);
        } else if (newVacation > this.holidaysLeft){
            System.out.println("Not enough vacation days!");
            System.out.println("Days left: " + this.holidaysLeft);
        }

    }

    public int getAge() {
        return DateCalc.calcDaysBetweenTwoDate(this.dayOfBirth, Date.today) / 365;
    }
    private int setUpHolidaysCount() {
        return (DateCalc.calcDaysBetweenTwoDate(this.hiringDate, Date.today) / 12);
    }
    private int setUpHolidaysAlreadyTaken() {
        return 0;
    }
    private int setUpHolidaysLeft() {
        return this.holidaysLeft = this.holidaysSum - this.holidaysAlreadyTaken;
    }

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

    public String toString() {
        return "name: " + name
                + "\t" + "surname: " + lastname
                + "\t" + "age: " + age
                + "\t" + "vacation taken: " + holidaysAlreadyTaken
                + "\t" + "vacation left: " + holidaysLeft;
    }

}