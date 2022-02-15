package com.hillel.homeworks.homework09.entries;

import com.hillel.homeworks.homework09.utils.Date;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class SalaryEmployee extends Employee{
    String employeeType;
    double annualSalary = 0;

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