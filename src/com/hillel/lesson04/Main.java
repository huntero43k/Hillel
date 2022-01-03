package com.hillel.lesson04;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[10][10];

        String[] strings = {
                "srt1", "srt2", "srt3"
        };

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = i * j;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%-2d ", arr[i][j]);
            }
            System.out.println();
        }

//        for (int arrElement : arr) {
//            System.out.println(arrElement);
//        }

//        String output = Arrays.toString(arr);
//        System.out.println(output);

//        forLoop(scanner);

//        switchIf(scanner);

//        int temp = 0;
//        int temp1 = 0;
////        temp = temp + 5;
////        temp += 5;
////
////        temp++;
////        temp += 1;
//
//        System.out.println(temp++);
//        System.out.println(++temp1);
    }

    public static void switchIf(Scanner scanner) {
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                System.out.println("Alpha");
                break;
            case 2:
                System.out.println("Beta");
                break;
            default:
                System.out.println("Unknown");
        }
    }

    public static void forLoop(Scanner scanner) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i + 1);
//        }
//        System.out.println(i);

//        for (;;) {}

//        int j = 0;
//        for (;j < 10; j++){}

//        int j = 0;
//        for (;j < 10;) {
//            int f = scanner.nextInt();
//            j += f;
//        }

//        int j = 0;
//        for (; j < 10; j += scanner.nextInt()) {
//        }

        for (int i = 0; i < 10; i++) {
            if (i == 3)
                continue;
            System.out.println(i + 1);
        }
    }

    public static void doWhile(Scanner scanner) {
        int i;
        do {
            System.out.println("Give me aby number?");
            i = scanner.nextInt();
            System.out.println("Your number: " + i);
        } while (i != 1);
    }

    public static void whileLoop2(Scanner scanner) {
        int i;
        vasia : while (true) {
            System.out.println("Give me aby number?");
            i = scanner.nextInt();
            System.out.println("Your number: " + i);
            while (true) {
                int temp = 10;
                if (i == 1) {
                    break vasia;
                }
            }
        }
        System.out.println("Your last number = " + i);
    }

    public static void whileLoop(Scanner scanner, int i) {
        while (i != 1) {
            System.out.println("Give me aby number?");
            i = function2();//scanner.nextInt();
            System.out.println("Your number: " + i);
        }
        System.out.println("We have found 1!");
        System.out.println("Finishing program!");
    }

    public static void function1(Scanner scanner, int i) {
        if (i == 1) {
            System.out.println("We have found 1!");
            System.out.println("Finishing program!");
        } else {
            System.out.println("Give me aby number?");
            i = function2(); //scanner.nextInt();
            System.out.println("Your number: " + i);
            function1(scanner, i);
        }
    }

    public static int function2() {
        return 56;
    }

    public static float function3() {
        return 4.5f;
    }

    public static short function4() {
        return 6;
    }

    public static double function5() {
        return Double.MAX_VALUE;
    }

    public static String function6() {
        return "Dima";
    }

}
