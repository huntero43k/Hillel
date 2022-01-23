package com.hillel.temp;

import java.util.Scanner;

public class LoopTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        for (int i = 0; ; i++) {
            i = scanner.nextInt();
            if (i == -1) {
                System.out.println(sum / count);
                break;
            } else
            sum = sum + i;
            count++;
        }

        }
    }

