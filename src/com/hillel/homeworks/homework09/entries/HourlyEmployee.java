package com.hillel.homeworks.homework09.entries;

import com.hillel.homeworks.homework09.utils.Date;

public class HourlyEmployee extends Employee{
    String employeeType;
    double HourlyWage;
    double HoursWorked;

    public HourlyEmployee(String name, String lastname, Date dayOfBirth, Date hiringDate, int holidaysAlreadyTaken) {
        super(name, lastname, dayOfBirth, hiringDate);
        this.takeVacation(holidaysAlreadyTaken);
        this.employeeType = "Hourly Employee";
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + "TYPE: "+ employeeType + " |";
    }
}
