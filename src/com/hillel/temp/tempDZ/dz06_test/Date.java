package com.hillel.temp.tempDZ.dz06_test;
import java.time.LocalDate;

public class Date {
    int d;
    int m;
    int y;

    Date (int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    public static void toString(Date date) {
        System.out.println(date.d + "/" + date.m + "/" + date.y);
    }

}
