package com.hillel.Temp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    String date;

    Date(String date) {
        this.date = date;
    }

    public static LocalDate format (String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate dateFormatted = LocalDate.parse(date, formatter);
        return dateFormatted;
    }

}
