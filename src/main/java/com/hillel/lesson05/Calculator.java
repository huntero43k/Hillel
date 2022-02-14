package com.hillel.lesson05;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            double num1 = getDouble();
            double num2 = getDouble();
            char operation = getOperation();
            double result = calc(num1, num2, operation);
            formatting("Результат вычисления: " + result);
            System.out.println("Желаете продолжить? [Y/N]");
            String exit = scanner.nextLine();
            if (exit.equalsIgnoreCase("y")){
                loop = true;
            } else if (exit.equalsIgnoreCase("n")) {
                loop = false;
                System.out.println("СПАСИБО ЗА 100 баллов! До встречи :)");
            } else {
                System.out.println("Некорректные данные, пожалуй продолжим ;)");
            }
        }
    }

    public static double getDouble () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Вы совершили ошибку, попробуйте еще раз!");
            scanner.next();
            num = getDouble();
        }
        return num;
    }
    public static char getOperation () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию (+ - / *)");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы совершили ошибку, попробуйте еще раз!");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    public static double calc (double num1, double num2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = (num1) / (num2);
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Ошибка, давайте попробуем еще раз");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
    public static void formatting(String s) {
        String line1 = "---------------------------------------------";
        String line2 = "|%-43s|\n";
        System.out.println(line1);
        System.out.printf(line2, s);
        System.out.println(line1);
    }
}