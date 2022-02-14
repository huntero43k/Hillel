package com.hillel.lesson04.task3;

import java.util.Scanner;
/*
Определите сумму всех элементов последовательности, завершающейся числом 0
Sample Input: 3 6 8 0 Sample Output: 17
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int result = 0;
        while (true) {
            int num = console.nextInt();
            if (num == 0) {
                break;
            }
            result = result + num;
        }
        System.out.println(result);
    }
}