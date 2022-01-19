package com.hillel.temp.tempDZ.temp.dz06_test;

public class Date {
    int d;
    int m;
    int y;
    final static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    Date (int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }
}
