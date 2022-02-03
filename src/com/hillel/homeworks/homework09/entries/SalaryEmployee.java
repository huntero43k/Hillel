package com.hillel.homeworks.homework09.entries;

import com.hillel.homeworks.homework09.utils.Date.Date;

public class SalaryEmployee extends Employee{

    SalaryEmployee(String name, String lastname, Date dayOfBirth, Date hiringDate, int holidaysAlreadyTaken) {
        super(name, lastname, dayOfBirth, hiringDate, holidaysAlreadyTaken);
    }
}
