package com.hillel.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int temp = scanner.nextInt();
        while (temp != 0) {
            arr.add(temp);
            temp = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        System.out.println(sum * 1.0 / arr.size());
    }
}
