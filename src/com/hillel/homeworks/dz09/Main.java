package com.hillel.homeworks.dz09;

import com.hillel.homeworks.dz09.entries.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Employee> EMPLOYEE_LIST = new ArrayList<>();
    public static Scanner SCANNER_STR = new Scanner(System.in);
    public static Scanner SCANNER_INT = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("1. CREATE");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4. EDIT");
            System.out.println("5. DELETE");
            System.out.println("6. EXIT");
            System.out.println("Enter Your Choice: ");
            int option = SCANNER_INT.nextInt();
            switch (Option.of(option)) {
                case CREATE -> {
                    System.out.print("Enter Employee name: ");
                    String name = SCANNER_STR.nextLine();
                    System.out.print("Enter Employee lastname: ");
                    String lastname = SCANNER_STR.nextLine();
                    System.out.print("Enter Employee dayOfBirth dd/MM/yyyy: ");
                    String dayOfBirth = SCANNER_STR.nextLine();
                    System.out.print("Enter Employee hiringDate dd/MM/yyyy: ");
                    //EMPLOYEE_LIST.add(new Employee(name,lastname,));
                }
                case DISPLAY -> {
                    System.out.println(EMPLOYEE_LIST);
                }
            }
        }

    }

    // create menu list with value id
    enum Option {
        CREATE(1),
        DISPLAY(2),
        SEARCH(3),
        EDIT(4),
        DELETE(5),
        EXIT(6),
        ;
        private final int value;

        Option(int value) {
            this.value = value;
        }

        public static Option of(int value) {
            for (Option option : values()) {
                if (option.value == value) {
                    return option;
                }
            }
            throw new IllegalArgumentException("Option with selected value=" + value + " not found");
        }
    }
}
