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
        System.out.println(DateCalc.calcAge(date1));
        ;
    }
}
