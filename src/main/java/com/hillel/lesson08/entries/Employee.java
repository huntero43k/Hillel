package com.hillel.lesson08.entries;

public abstract class Employee {
    String name;
    String lastName;
    String dayOfBirth;
    int holidaysAlreadyTaken;

    Employee(String name, String lastName, String dayOfBirth, int holidaysAlreadyTaken) {
        this.name = name;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.holidaysAlreadyTaken = holidaysAlreadyTaken;
    }

    Employee(String name, String lastName, String dayOfBirth) {
        this (name, lastName,dayOfBirth, 0);
    }

    //abstract void salaryReview(double newSalary)

}
