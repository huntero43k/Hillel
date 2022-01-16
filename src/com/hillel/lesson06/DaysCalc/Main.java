package com.hillel.lesson06.DaysCalc;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public long daysBetween (Date one, Date two) {
        long difference = (one.getTime() - two.getTime()) / 86400000; //86400000 is the number milliseconds in a day
        return Math.abs(difference);
    }

    public static void main(String[] args) {
        Date today = new Date();

        Calendar myNextCalendar = Calendar.getInstance();
        myNextCalendar.set(2023, 0, 1); // 0 is January
        Date nyd = myNextCalendar.getTime();

        Main myObj = new Main();
        long days = myObj.daysBetween(today, nyd);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
        String todayDate = sdf.format(today);
        String newYearsDate = sdf.format(nyd);

        System.out.println(days + " days from today's date of " + todayDate + " until " + newYearsDate);
    }
}
