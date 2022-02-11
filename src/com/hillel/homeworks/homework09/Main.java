package com.hillel.homeworks.homework09;

import com.hillel.homeworks.homework09.entries.Employee;
import com.hillel.homeworks.homework09.entries.HourlyEmployee;
import com.hillel.homeworks.homework09.entries.Manager;
import com.hillel.homeworks.homework09.entries.SalaryEmployee;
import com.hillel.homeworks.homework09.utils.Date;
import com.hillel.homeworks.homework09.utils.DateCalc;

import java.util.*;

public class Main {
    public static List<Employee> EMPLOYEE_LIST = new ArrayList<>(500);
    public static Scanner SCANNER_STR = new Scanner(System.in);
    public static Scanner SCANNER_INT = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("1. CREATE");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4. VACATION");
            System.out.println("5. DELETE");
            System.out.println("6. EXIT");
            System.out.print("Enter Your Choice: ");
            int option = SCANNER_INT.nextInt();
            switch (Option.of(option)) {
                case CREATE -> createEmployee();
                case DISPLAY -> displayEmployee();
                case SEARCH -> searchEmployee();
                case VACATION -> takeVacation();
                case DELETE -> deleteEmployee();
                case EXIT -> exit = true;
            }
        }
    }

    // create employee menu
    public static void createEmployee() {
        int menuTempOption = 1; // костыль
        for (EmployeeType type : EmployeeType.values()) {
            System.out.println("\t" + menuTempOption++ + ". " + type.name());
        }
        System.out.print("Select Employee Type: ");
        int option = SCANNER_INT.nextInt();
        switch (EmployeeType.of(option)) {
            case HOURLY_EMPLOYEE -> createHourlyEmployee();
            case SALARY_EMPLOYEE -> createSalaryEmployee();
            case MANAGER -> createManager();
            default -> System.out.println("Sorry, option not found!");
        }
    }

    // create new HourlyEmployee
    public static void createHourlyEmployee() {
        System.out.print("Enter HourlyEmployee name: ");
        String name = SCANNER_STR.nextLine();
        System.out.print("Enter HourlyEmployee lastname: ");
        String lastname = SCANNER_STR.nextLine();
        System.out.print("Enter hourlyEmployee dayOfBirth dd MM yyyy: ");
        Date dayOfBirth = new Date(SCANNER_INT.nextInt(), SCANNER_INT.nextInt(), SCANNER_INT.nextInt());
        System.out.print("Enter HourlyEmployee hiringDate dd MM yyyy: ");
        Date hiringDate = new Date(SCANNER_INT.nextInt(), SCANNER_INT.nextInt(), SCANNER_INT.nextInt());
        System.out.println("\t" + "Approximate vacation days near: ~ " + holidaysPreview(hiringDate) + " days");
        System.out.print("Enter sum of all taken holidays by " + name + " " + lastname + " : ");
        int holidaysAlreadyTaken = SCANNER_INT.nextInt();
        EMPLOYEE_LIST.add(new HourlyEmployee(name,lastname,dayOfBirth,hiringDate,holidaysAlreadyTaken));
        System.out.println("\n" + "*** Employee was created successfully!***" + "\n");
    }

    // create new SalaryEmployee
    public static void createSalaryEmployee() {
        System.out.print("Enter SalaryEmployee name: ");
        String name = SCANNER_STR.nextLine();
        System.out.print("Enter SalaryEmployee lastname: ");
        String lastname = SCANNER_STR.nextLine();
        System.out.print("Enter SalaryEmployee dayOfBirth dd MM yyyy: ");
        Date dayOfBirth = new Date(SCANNER_INT.nextInt(), SCANNER_INT.nextInt(), SCANNER_INT.nextInt());
        System.out.print("Enter SalaryEmployee hiringDate dd MM yyyy: ");
        Date hiringDate = new Date(SCANNER_INT.nextInt(), SCANNER_INT.nextInt(), SCANNER_INT.nextInt());
        System.out.println("\t" + "Approximate vacation days near: ~ " + holidaysPreview(hiringDate) + " days");
        System.out.print("Enter sum of all taken holidays by " + name + " " + lastname + " : ");
        int holidaysAlreadyTaken = SCANNER_INT.nextInt();
        EMPLOYEE_LIST.add(new SalaryEmployee(name, lastname, dayOfBirth, hiringDate,holidaysAlreadyTaken));
        System.out.println("\n" + "*** Employee was created successfully!***" + "\n");
    }

    // create new Manager
    public static void createManager() {
        System.out.print("Enter Manager name: ");
        String name = SCANNER_STR.nextLine();
        System.out.print("Enter Manager lastname: ");
        String lastname = SCANNER_STR.nextLine();
        System.out.print("Enter Manager dayOfBirth dd MM yyyy: ");
        Date dayOfBirth = new Date(SCANNER_INT.nextInt(), SCANNER_INT.nextInt(), SCANNER_INT.nextInt());
        System.out.print("Enter Manager hiringDate dd MM yyyy: ");
        Date hiringDate = new Date(SCANNER_INT.nextInt(), SCANNER_INT.nextInt(), SCANNER_INT.nextInt());
        System.out.println("\t" + "Approximate vacation days near: ~ " + holidaysPreview(hiringDate) + " days");
        System.out.print("Enter sum of all taken holidays by " + name + " " + lastname + " : ");
        int holidaysAlreadyTaken = SCANNER_INT.nextInt();
        EMPLOYEE_LIST.add(new Manager(name, lastname, dayOfBirth, hiringDate, holidaysAlreadyTaken));
        System.out.println("\n" + "*** Employee was created successfully!***" + "\n");
    }

    // ATTENTION! This is not an exact value, it is used only for convenience in user interface menu
    // display approximate number of available vacation days
    public static int holidaysPreview(Date hiringDate) {
        return (int) (DateCalc.calcMonthsBetweenTwoDate(hiringDate) * 2.5);
    }

    // display all employees
    public static void displayEmployee() {
        System.out.println("--------------------------------------------------------------------------------");
        Iterator<Employee> i = EMPLOYEE_LIST.iterator();
        while (i.hasNext()) {
                Employee employee = i.next();
                {
                    System.out.println(employee);
                }
            }
        if (EMPLOYEE_LIST.size() == 0) {
            System.out.println("NO RECORDS IN DATABASE");
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

    // search employee
    public static void searchEmployee() {
        boolean found = false;
        System.out.print("Enter employee lastname for SEARCH: ");
        String searchQuery = SCANNER_STR.nextLine();
        System.out.println("--------------------------------------------------------------------------------");
        for (Employee e : EMPLOYEE_LIST) {
            if (e.getLastname().equalsIgnoreCase(searchQuery) ||
                    e.getName().equalsIgnoreCase(searchQuery)) {
                System.out.println(e);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Record Not Found :(");
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

    // take vacation
    public static void takeVacation() {
        boolean found = false;
        System.out.println("\t" + "***  TAKE VACATION MENU  ***");
        System.out.print("Enter employee lastname to add new vacation: ");
        String searchQuery = SCANNER_STR.nextLine();
        System.out.println("--------------------------------------------------------------------------------");
        for (Employee e : EMPLOYEE_LIST) {
            if (e.getLastname().equalsIgnoreCase(searchQuery) ||
                    e.getName().equalsIgnoreCase(searchQuery)) {
                System.out.println("\t" + "* "+ e.getName() + " " + e.getLastname()
                        + " -> " + e.getHolidaysLeft() + " days left");
                System.out.println("------------------------------");
                System.out.print("Enter days number of NEW vacation: ");
                int newVacation = SCANNER_INT.nextInt();
                e.takeVacation(newVacation);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Record Not Found :(");
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

    // delete employee
    public static void deleteEmployee() {
        boolean found = false;
        System.out.print("Enter lastname of employee to DELETE: ");
        String searchQuery = SCANNER_STR.nextLine();
        System.out.println("--------------------------------------------------------------------------------");
        Iterator<Employee> i = EMPLOYEE_LIST.iterator();
        while (i.hasNext()) {
            Employee e = i.next();
            if (e.getLastname().equalsIgnoreCase(searchQuery) ||
                    e.getName().equalsIgnoreCase(searchQuery)) {
                i.remove();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Record Not Found :(");
        } else {
            System.out.println("Record DELETED successfully!");
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

    // menu list with value id
    enum Option {
        CREATE(1),
        DISPLAY(2),
        SEARCH(3),
        VACATION(4),
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

    // employee type menu
    enum EmployeeType {
        HOURLY_EMPLOYEE(1),
        SALARY_EMPLOYEE(2),
        MANAGER(3),
        ;
        private final int value;

        EmployeeType(int value) {
            this.value = value;
        }

        public static EmployeeType of(int value) {
            for (EmployeeType option : values()) {
                if (option.value == value) {
                    return option;
                }
            }
            throw new IllegalArgumentException("Option with selected value=" + value + " not found");
        }
    }

}