package com.hillel.homeworks.homework09.entries;

import com.hillel.homeworks.homework09.utils.Date.Date;

public class HourlyEmployee extends Employee{
    double hourlyWage;
    double hoursWorked;

    HourlyEmployee(String name, String lastname, Date dayOfBirth, double hourlyWage, double hoursWorked) {
        super(name, lastname, dayOfBirth);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

}
