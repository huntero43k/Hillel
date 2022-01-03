package com.hillel.lesson04;

import java.util.Scanner;
/*
Вывести два соседних элемента одного знака. Все числа отличны от нуля.
Если таких пар соседей несколько - выведите первую пару (Элементы выводятся в порядке неубывания)
 */
public class Temp1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int arraySize = console.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        for (int i = 1; i < array.length; i++) {
            if ((array[i - 1] >= 0) && (array[i] >= 0)) {
                System.out.println(array[i - 1] + " " + array[i]);
                break;
            } else if ((array[i - 1] < 0) && (array[i] < 0)) {
                System.out.println(array[i - 1] + " " + array[i]);
                break;
            }
        }
    }
}