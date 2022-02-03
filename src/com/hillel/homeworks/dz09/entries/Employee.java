package com.hillel.homeworks.dz09.entries;

public class Employee {
    private final String name;
    private final String lastname;
    String dayOfBirth;
    String hiringDate;
    int holidaysAlreadyTaken;
    final private int holidaysCount = 0;

    public Employee(String name, String lastname, String dayOfBirth, String hiringDate) {
        this.name = name;
        this.lastname = lastname;
        this.dayOfBirth = dayOfBirth;
        this.hiringDate = hiringDate;
    }

    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }

    public String toString() {
        return name + " " + lastname;
    }

}