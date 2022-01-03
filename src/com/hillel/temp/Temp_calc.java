package com.hillel.temp;

import java.util.Scanner;

public class Temp_calc {
    public static void main(String[] args) {
    int num1 = getInt();
    int num2 = getInt();
    char operator = getOperation();
    int result = calc(num1,num2, operator);
        System.out.println("Ваше результат: " + result);
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка, данные некорректны, введите число");
            scanner.next();
            num = getInt();
        }
        return num;
    }
    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию (+ - / *)");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка, данные некорректны, введите оператор:");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int calc (int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 -num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Некорректные данные");
                result = calc(num1, num2, operation);
        }
        return result;
    }
}