package com.hillel.homeworks.dz09.entries;

import com.hillel.homeworks.dz09.utils.Date;
import com.hillel.homeworks.dz09.utils.DateCalc;

abstract public class Employee {
    private final String name;
    private final String lastname;
    Date dayOfBirth;
    Date hiringDate;
    int holidaysAlreadyTaken;
    final public int holidaysSum;
    final public int age;

    public Employee(String name, String lastname, Date dayOfBirth, Date hiringDate) {
        this.name = name;
        this.lastname = lastname;
        this.dayOfBirth = dayOfBirth;
        this.hiringDate = hiringDate;
        this.holidaysSum = setUpHolidaysCount();
        this.age = getAge();
    }

//    static int getAge (Date dateOfBirth) {
//        return (calcDaysBetweenTwoDate(dateOfBirth, Date.today)) / 365;
//    }

    // calculate holidays 30 days per year || 32 days per year if age is 50
//    public int calcHolidays() {
//        return (calcDaysBetweenTwoDate(hiringDate, Date.today)) / 12;
//    }
    public int getAge() {
        return DateCalc.calcDaysBetweenTwoDate(this.dayOfBirth, Date.today) / 365;
    }

    public int setUpHolidaysCount() {
        return DateCalc.calcDaysBetweenTwoDate(this.hiringDate, Date.today) / 12;
    }

    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }

    public String toString() {
        return name + " " + lastname;
    }

}