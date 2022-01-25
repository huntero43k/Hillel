package com.hillel.Temp;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class DateCalculator {

     public static long calculateNumberOfDaysBetweenTwoDate(Temporal date1, Temporal date2) {
         long days = ChronoUnit.DAYS.between(date1, date2);
         return days;
     }

}
