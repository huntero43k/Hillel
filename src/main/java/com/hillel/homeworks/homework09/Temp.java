package com.hillel.homeworks.homework09;

import com.hillel.homeworks.homework09.utils.Date;
import com.hillel.homeworks.homework09.utils.DateCalc;

public class Temp {
    public static void main(String[] args) {
        double a = 2.9;
        int b = 5;
        int c = (int)(b * a);
        System.out.println(c);

        Date date1 = new Date("23.02.1970");
        Date date10 = new Date(1, 1, 2000);
        Date date11 = new Date(11, 1, 2000);
        Date date12 = new Date(1,10,2000);
        System.out.println(DateCalc.calcDaysBetweenTwoDate(date1,Date.today));
        System.out.println(DateCalc.calcAge(date1));
        System.out.println(date1);
        System.out.println("===================");
        System.out.println(date10);
        System.out.println(date11);
        System.out.println(date12);
        ;
    }
}
