package com.hillel.homeworks.homework09.entries;

import com.hillel.homeworks.homework09.utils.Date.Date;

public class SalaryEmployee extends Employee{
    double salary;

    SalaryEmployee(String name, String lastname, Date dayOfBirth, double salary) {
        super(name, lastname, dayOfBirth);
        this.salary = salary;
    }


}
