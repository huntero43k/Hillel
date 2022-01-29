package com.hillel.homeworks.homework09.entries;

import com.hillel.homeworks.homework09.utils.Date.Date;

public abstract class Employee {
    String name;
    String lastname;
    Date dayOfBirth;
    int holidaysAlreadyTaken;

    Employee(String name, String lastname, Date dayOfBirth, int holidaysAlreadyTaken) {
        this.name = name;
        this.lastname = lastname;
        this.dayOfBirth = dayOfBirth;
        this.holidaysAlreadyTaken = holidaysAlreadyTaken;
    }

    Employee(String name, String lastname, Date dayOfBirth) {
        this(name, lastname, dayOfBirth, 0);
    }


}
