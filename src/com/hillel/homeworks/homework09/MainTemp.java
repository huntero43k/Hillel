package com.hillel.homeworks.homework09;

import com.hillel.homeworks.homework09.entries.Employee;
import com.hillel.homeworks.homework09.entries.Manager;
import com.hillel.homeworks.homework09.utils.Date;
import com.hillel.homeworks.homework09.utils.DateCalc;

public class MainTemp {
    public static void main(String[] args) {
        Date birth = new Date(23, 02, 1990);
        Date hiring = new Date(24,4,2018);
        Date now = Date.today;
        System.out.println(now);
        int vacation = 90;

        Employee em1 = new Manager("Ihor", "Abramovich", birth, hiring);
        em1.takeVacation(vacation);
        em1.takeVacation(2);
        em1.takeVacation(3);
        em1.takeVacation(21);
        em1.takeVacation(21);
        em1.takeVacation(14);
        em1.getAge();

        System.out.println(DateCalc.calcDaysBetweenTwoDate(birth,Date.today));

        System.out.println(em1);

    }
}
