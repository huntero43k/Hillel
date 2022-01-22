package com.hillel.homeworks.homework06;

public class Main {
    public static void main(String[] args) {
        //printMenu();
        Date date1 = new Date(23, 2, 1990);
        Date date2 = new Date(22, 1, 2022);

        //System.out.println("date1 exists: " + Date.isValidDate(date1) + "\n" + "date2 exists: " + Date.isValidDate(date2));
        System.out.println("Difference between two dates are (in days): " + "\n" +
                DateCalculator.calculateNumberOfDaysBetweenTwoDate(date1, date2));

    }

    // make beauty
    public static void printMenu () {
        String line1 = "-----------------------------------------------";
        String line2 = "|%-45s|\n";
        String line3 = "Correct input date format is --> dd MM YYYY";
        String line4 = "Input first date1, after that input date2";
        System.out.println(line1);
        System.out.printf(line2, line3, line4);
        System.out.println(line1);
    }

}
