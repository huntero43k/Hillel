package com.hillel.homeworks.homework09;

import com.hillel.homeworks.homework09.entries.Employee;
import com.hillel.homeworks.homework09.entries.Manager;
import com.hillel.homeworks.homework09.utils.Date;
import com.hillel.homeworks.homework09.utils.DateCalc;

import java.util.ArrayList;
import java.util.List;

public class MainTemp {
    public static List<Employee> EMPLOYEE_LIST = new ArrayList<>();

    public static void main(String[] args) {
        String name = "Ihor";
        String lastname = "Abramovich";
        Date dayOfBirth = new Date(23, 02, 1990);
        Date hiringDate = new Date(24, 02, 2018);
        int holidaysAlreadyTaken = 20;
        EMPLOYEE_LIST.add(new Manager(name, lastname, dayOfBirth, hiringDate,holidaysAlreadyTaken));
        System.out.println(EMPLOYEE_LIST);

    }
}
