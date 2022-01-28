package com.hillel.Temp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateCalculator {

     public static long calculateNumberOfDaysBetweenTwoDate(Date firstDate, Date secondDate) {
         LocalDate date1 = Date.format(firstDate.date);
         LocalDate date2 = Date.format(secondDate.date);
         long days = ChronoUnit.DAYS.between(date1, date2);
         return days;
     }

}