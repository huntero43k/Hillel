package com.hillel.temp;

public class TempArrayClass {
    public static void printArraySum (int [] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) {
        int[] fibNextInt = new int[]{1, 2, 3, 5, 8, 13, 21, 34, 55};
        printArraySum(fibNextInt);
    }
}
