package com.hillel.homeworks.homework07.task19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<String, String> dictionary = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        String[] words = new String[n*2];

        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.next();
            // put values to dictionary <K, V>
            if (i > 0 && i % 2 != 0) {
                dictionary.put(words[i - 1], words[i]);
            }
        }
        String temp = scanner.nextLine();
        System.out.print("Enter you word to get synonym with dictionary: ");

        String word = scanner.nextLine();
        getSynonym(word);

    }

    public static void getSynonym(String word) {
        for (var entry : dictionary.entrySet()) {
            if (entry.getKey().equals(word)) {
                System.out.println(entry.getValue());
            } else if (entry.getValue().equals(word)) {
                System.out.println(entry.getKey());
            }
        }
    }

}