package com.hillel.lesson04.task1;

import java.util.Scanner;
/*
Вывести все квадраты положительных натуральных чисел, не превосходящие N (введенное число с консоли)
Sample Input: 50 Sample Output: 1 4 9 16 25 36 49
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int square;
        for (int i = 1; ; i++) {
            square = i * i;
            if (square > N) {
                break;
            }
            System.out.print(square + " ");
        }
    }
}