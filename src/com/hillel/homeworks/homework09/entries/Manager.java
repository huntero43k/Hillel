package com.hillel.homeworks.homework09.entries;

import com.hillel.homeworks.homework09.utils.Date;

public class Manager extends Employee{
    String employeeType;
    double profitSharing;

    public Manager(String name, String lastname, Date dayOfBirth, Date hiringDate, int holidaysAlreadyTaken) {
        super(name, lastname, dayOfBirth, hiringDate);
        this.takeVacation(holidaysAlreadyTaken);
        this.employeeType = "Manager";
    }



    @Override
    public String toString() {
        return super.toString() + "\t" + "Type: "+ employeeType + " |";
    }
}
