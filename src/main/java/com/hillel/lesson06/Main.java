package com.hillel.lesson06;

import java.util.Date;
import java.time.LocalDate;                 // import the LocalDate class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class Main {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(myFormatObj);
    }
}
