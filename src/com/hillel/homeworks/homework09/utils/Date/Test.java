package com.hillel.homeworks.homework09.utils.Date;

public class Test {
    public static void main(String[] args) {
        Date dayOfBirth = new Date(30, 2, 1990);
        Date today = Date.today;

        Date.printDate(dayOfBirth);
        System.out.println(Date.isValidDate(dayOfBirth));
        System.out.println(DateCalc.calcDaysBetweenTwoDate(dayOfBirth, today));
    }
}
