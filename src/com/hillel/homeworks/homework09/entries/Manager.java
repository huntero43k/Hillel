package com.hillel.homeworks.homework09.entries;

import com.hillel.homeworks.homework09.utils.Date.Date;

public class Manager extends Employee{

    double profitSharing;

    Manager(String name, String lastname, Date dayOfBirth, double profitSharing) {
        super(name, lastname, dayOfBirth);
        this.profitSharing = profitSharing;
    }


}
