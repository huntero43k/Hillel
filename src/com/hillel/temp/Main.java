package com.hillel.temp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        //int age = console.nextInt();
        print(name);

    }
    // делаем красоту
    public static void print (String s) {
        String line1 = "---------------------------";
        String line2 = "|%-25s|\n";
        System.out.println(line1);
        System.out.printf(line2, s);
        System.out.println(line1);
    }
}
