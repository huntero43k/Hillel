package com.hillel.lesson06.oop;

public class Main {
    public static void main(String[] args) {
        Marker green = new Marker("green");
        Marker blue = new Marker("blue");

        try {
            green.draw("Hello OOP!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        blue.open();
        blue.draw("Hello OOP!");
    }
}
