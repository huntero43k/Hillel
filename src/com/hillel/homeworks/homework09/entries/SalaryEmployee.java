package com.hillel.homeworks.homework09.entries;

import com.hillel.homeworks.homework09.utils.Date;

public class SalaryEmployee extends Employee{
    String employeeType;
    double annualSalary;

    public SalaryEmployee(String name, String lastname, Date dayOfBirth, Date hiringDate, int holidaysAlreadyTaken) {
        super(name, lastname, dayOfBirth, hiringDate);
        this.takeVacation(holidaysAlreadyTaken);
        this.employeeType = "Salary Employee";
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + "TYPE: "+ employeeType + " |";
    }
}
