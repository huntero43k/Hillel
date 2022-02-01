package com.hillel.homeworks.homework09.entries;

import com.hillel.homeworks.homework09.utils.Date.Date;

public abstract class Employee {
    String name;
    String lastname;
    Date dayOfBirth;
    Date hiringDate;
    int holidaysAlreadyTaken;

    Employee(String name, String lastname, Date dayOfBirth, Date hiringDate,int holidaysAlreadyTaken) {
        this.name = name;
        this.lastname = lastname;
        this.dayOfBirth = dayOfBirth;
        this.hiringDate = hiringDate;
        this.holidaysAlreadyTaken = holidaysAlreadyTaken;
    }

    Employee(String name, String lastname, Date dayOfBirth, Date hiringDate) {
        this(name, lastname, dayOfBirth, hiringDate,0);
    }


}
