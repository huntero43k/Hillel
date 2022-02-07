package com.hillel.homeworks.homework09;

import com.hillel.homeworks.homework09.entries.Employee;
import com.hillel.homeworks.homework09.entries.Manager;
import com.hillel.homeworks.homework09.utils.Date;

public class MainTemp {
    public static void main(String[] args) {
        Date birth = new Date(23, 02, 1990);
        Date hiring = new Date(22,04,2018);
        int vacation = 90;

        Employee em1 = new Manager("Ihor", "Abramovich", birth, hiring);
        em1.takeVacation(vacation);
        em1.takeVacation(2);
        em1.takeVacation(3);
        em1.takeVacation(21);


        System.out.println(em1);

    }
}
