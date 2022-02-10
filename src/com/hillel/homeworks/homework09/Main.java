package com.hillel.homeworks.homework09;

import com.hillel.homeworks.homework09.entries.Employee;
import com.hillel.homeworks.homework09.entries.HourlyEmployee;
import com.hillel.homeworks.homework09.entries.Manager;
import com.hillel.homeworks.homework09.entries.SalaryEmployee;
import com.hillel.homeworks.homework09.utils.Date;

import java.util.*;

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
            System.out.println("4. UPDATE");
            System.out.println("5. DELETE");
            System.out.println("6. EXIT");
            System.out.print("Enter Your Choice: ");
            int option = SCANNER_INT.nextInt();
            switch (Option.of(option)) {
                case CREATE -> createEmployee();
                case DISPLAY -> displayEmployee();
                case SEARCH -> searchEmployee();
                case EDIT -> updateEmployee();
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

    // create new HourlyEmployee class object
    public static void createHourlyEmployee() {
        System.out.print("Enter HourlyEmployee name: ");
        String name = SCANNER_STR.nextLine();
        System.out.print("Enter HourlyEmployee lastname: ");
        String lastname = SCANNER_STR.nextLine();
        System.out.print("Enter hourlyEmployee dayOfBirth dd MM yyyy: ");
        Date dayOfBirth = new Date(SCANNER_INT.nextInt(), SCANNER_INT.nextInt(), SCANNER_INT.nextInt());
        //Date dayOfBirth1 = new Date(SCANNER_INT.nextLine().trim().replace("\n", "."));
        System.out.print("Enter HourlyEmployee hiringDate dd MM yyyy: ");
        Date hiringDate = new Date(SCANNER_INT.nextInt(), SCANNER_INT.nextInt(), SCANNER_INT.nextInt());
        System.out.print("Enter sum of all taken holidays by " + name + " " + lastname + " : ");
        int holidaysAlreadyTaken = SCANNER_INT.nextInt();
        EMPLOYEE_LIST.add(new HourlyEmployee(name,lastname,dayOfBirth,hiringDate,holidaysAlreadyTaken));
        System.out.println("\n" + "*** Employee was created successfully!***" + "\n");
    }

    // create new SalaryEmployee class object
    public static void createSalaryEmployee() {
        System.out.print("Enter SalaryEmployee name: ");
        String name = SCANNER_STR.nextLine();
        System.out.print("Enter SalaryEmployee lastname: ");
        String lastname = SCANNER_STR.nextLine();
        System.out.print("Enter SalaryEmployee dayOfBirth dd MM yyyy: ");
        Date dayOfBirth = new Date(SCANNER_INT.nextInt(), SCANNER_INT.nextInt(), SCANNER_INT.nextInt());
        System.out.print("Enter SalaryEmployee hiringDate dd MM yyyy: ");
        Date hiringDate = new Date(SCANNER_INT.nextInt(), SCANNER_INT.nextInt(), SCANNER_INT.nextInt());
        System.out.print("Enter sum of all taken holidays by " + name + " " + lastname + " : ");
        int holidaysAlreadyTaken = SCANNER_INT.nextInt();
        EMPLOYEE_LIST.add(new SalaryEmployee(name, lastname, dayOfBirth, hiringDate,holidaysAlreadyTaken));
        System.out.println("\n" + "*** Employee was created successfully!***" + "\n");
    }

    // create new Manager class object
    public static void createManager() {
        System.out.print("Enter Manager name: ");
        String name = SCANNER_STR.nextLine();
        System.out.print("Enter Manager lastname: ");
        String lastname = SCANNER_STR.nextLine();
        System.out.print("Enter Manager dayOfBirth dd MM yyyy: ");
        Date dayOfBirth = new Date(SCANNER_INT.nextInt(), SCANNER_INT.nextInt(), SCANNER_INT.nextInt());
        System.out.print("Enter Manager hiringDate dd MM yyyy: ");
        Date hiringDate = new Date(SCANNER_INT.nextInt(), SCANNER_INT.nextInt(), SCANNER_INT.nextInt());
        System.out.print("Enter sum of all taken holidays by " + name + " " + lastname + " : ");
        int holidaysAlreadyTaken = SCANNER_INT.nextInt();
        EMPLOYEE_LIST.add(new Manager(name, lastname, dayOfBirth, hiringDate,holidaysAlreadyTaken));
        System.out.println("\n" + "*** Employee was created successfully!***" + "\n");
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
        System.out.println("--------------------------------------------------------------------------------");
    }

    // search employees
    public static void searchEmployee() {
        boolean found = false;
        System.out.print("Enter lastname for SEARCH: ");
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

    // update menu
    public static void updateEmployee() {
        System.out.println("\t" + "1. TAKE VACATION");
        System.out.println("\t" + "2. EDIT EMPLOYEE");
        System.out.print("Enter Your Choice: ");
        int option = SCANNER_INT.nextInt();
        switch (option) {
            case 1:
                takeVacation();
                break;
            case 2:
                editEmployee();
                break;
            default: System.out.println("Sorry, option not found!");
        }
    }

    public static void takeVacation() {
        boolean found = false;
        System.out.print("Enter lastname of employee to add new vacation: ");
        String searchQuery = SCANNER_STR.nextLine();
        System.out.println("--------------------------------------------------------------------------------");
        ListIterator<Employee> li = EMPLOYEE_LIST.listIterator();
        while (li.hasNext()) {
            Employee e = li.next();
            if (e.getLastname().equalsIgnoreCase(searchQuery) ||
                    e.getName().equalsIgnoreCase(searchQuery)) {
                System.out.println(e);
                System.out.println("------------------------------");
                System.out.print("Enter days number of NEW vacation: ");
                int newVacation = SCANNER_INT.nextInt();
                e.takeVacation(newVacation);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Record Not Found :(");
        } else {
            System.out.println("\n" + "*** Vacation entry has been successfully entered!***" + "\n");
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

    public static void editEmployee() {
        boolean found = false;
        System.out.print("Enter lastname of employee to EDIT: ");
        String searchQuery = SCANNER_STR.nextLine();
        System.out.println("--------------------------------------------------------------------------------");
        ListIterator<Employee> li = EMPLOYEE_LIST.listIterator();
        while (li.hasNext()) {
            Employee e = li.next();
            if (e.getLastname().equalsIgnoreCase(searchQuery) ||
                    e.getName().equalsIgnoreCase(searchQuery)) {
                System.out.println(e);
                System.out.println("------------------------------");
                System.out.print("Enter NEW name: ");
                String name = SCANNER_STR.nextLine();
                e.setName(name);
                System.out.print("Enter NEW lastname: ");
                String lastname = SCANNER_STR.nextLine();
                e.setLastname(lastname);
                System.out.print("Enter NEW dayOfBirth dd MM yyyy: ");
                Date dayOfBirth = new Date(SCANNER_INT.nextInt(), SCANNER_INT.nextInt(), SCANNER_INT.nextInt());
                e.setDayOfBirth(dayOfBirth);
                System.out.print("Enter NEW hiringDate dd MM yyyy: ");
                Date hiringDate = new Date(SCANNER_INT.nextInt(), SCANNER_INT.nextInt(), SCANNER_INT.nextInt());
                e.setHiringDate(hiringDate);
                System.out.print("Enter NEW sum of all taken holidays by " + name + " " + lastname + " : ");
                int holidaysAlreadyTaken = SCANNER_INT.nextInt();
                e.setHolidaysAlreadyTaken(holidaysAlreadyTaken);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Record Not Found :(");
        } else {
            System.out.println("\n" + "*** Employee was EDITED successfully!***" + "\n");
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

    // create employee types
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