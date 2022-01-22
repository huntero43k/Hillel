package com.hillel.temp;

public class Temp {
    public static void main(String[] args) {
        int x = 2000;
        System.out.println(dividingByFour(x));
    }
    static boolean dividingByFour (int x) {
        return x % 4 == 0;
    }
}