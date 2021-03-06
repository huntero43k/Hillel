package com.hillel.homeworks.homework09;

import com.hillel.homeworks.homework09.entries.Employee;
import com.hillel.homeworks.homework09.entries.HourlyEmployee;
import com.hillel.homeworks.homework09.entries.Manager;
import com.hillel.homeworks.homework09.entries.SalaryEmployee;
import com.hillel.homeworks.homework09.utils.Date;
import com.hillel.homeworks.homework09.utils.DateCalc;

import java.util.*;

public class Main {

    // For more convenient use of objects below, we take them out of the scope of the main method
    public static List<Employee> EMPLOYEE_LIST = new ArrayList<>();
    public static Scanner SCANNER_STR = new Scanner(System.in);
    public static Scanner SCANNER_INT = new Scanner(System.in);

    // Here start point of the program
    // creating menu loop using enum options
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            int menuOption = 1;
            for (Option option: Option.values()) {
                System.out.println(menuOption++ + ". " + option.name());
            }
            System.out.print("Enter Your Choice: ");
            int option = SCANNER_INT.nextInt();
            try {
                switch (Option.of(option)) {
                    case CREATE -> createEmployee();
                    case DISPLAY -> displayEmployee();
                    case SEARCH -> searchEmployee();
                    case VACATION -> vacation();
                    case DELETE -> deleteEmployee();
                    case EXIT -> exit = true;
                }
                // catch exception if input value different from menu values
                // this exception catches only integers
            } catch (IllegalArgumentException exception) {
                print(" INPUT ERROR! Out of range encountered.");
                System.out.print("Want to continue? Y/N: ");
                String temp = SCANNER_STR.nextLine();
                if (temp.equalsIgnoreCase("y")) {
                    printLine();
                }
                else System.exit(0);
            }
        }
    }

    // create employee menu
    public static void createEmployee() {
        if (EMPLOYEE_LIST.size() < 500) {
            int menuOption = 1;
            for (EmployeeType type : EmployeeType.values()) {
                System.out.println("\t" + menuOption++ + ". " + type.name());
            }
            System.out.print("Select Employee Type: ");
            int option = SCANNER_INT.nextInt();
            try {
                switch (EmployeeType.of(option)) {
                    case HOURLY_EMPLOYEE -> createHourlyEmployee();
                    case SALARY_EMPLOYEE -> createSalaryEmployee();
                    case MANAGER -> createManager();
                }
            }
            // catch exception if input value different from menu values
            // this exception catches only integers
            catch (IllegalArgumentException exception) {
                print(" INPUT ERROR! Out of range encountered.");
                System.out.print("Want to continue? Y/N: ");
                String temp = SCANNER_STR.nextLine();
                if (temp.equalsIgnoreCase("y")) {
                    printLine();
                    createEmployee();
                }
                else System.exit(0);
            }
        }
        else {
            print(" You have reached the maximum value of employees!");
        }
    }

    // create new HourlyEmployee object
    public static void createHourlyEmployee() {
        System.out.println("\t" + " * CREATE NEW HOURLY EMPLOYEE ->");
        System.out.print("Enter name: ");
        String name = SCANNER_STR.nextLine();
        System.out.print("Enter lastname: ");
        String lastname = SCANNER_STR.nextLine();
        System.out.print("Enter dayOfBirth (dd.MM.yyyy): ");
        Date dayOfBirth = new Date(SCANNER_STR.nextLine());
        System.out.print("Enter hiringDate (dd.MM.yyyy): ");
        Date hiringDate = new Date(SCANNER_STR.nextLine());
        System.out.println("\t" + "* ALL VACATION DAYS SUM (excluding extra days): " + holidaysPreview(hiringDate) + " days");
        System.out.print("Enter the amount of used holiday days by " + name + " " + lastname + " : ");
        int holidaysAlreadyTaken = SCANNER_INT.nextInt();
        EMPLOYEE_LIST.add(new HourlyEmployee(name,lastname,dayOfBirth,hiringDate,holidaysAlreadyTaken));
        print(" *** Employee was created successfully! ***");
    }

    // create new SalaryEmployee object
    public static void createSalaryEmployee() {
        System.out.println("\t" + " * CREATE NEW SALARY EMPLOYEE ->");
        System.out.print("Enter name: ");
        String name = SCANNER_STR.nextLine();
        System.out.print("Enter lastname: ");
        String lastname = SCANNER_STR.nextLine();
        System.out.print("Enter dayOfBirth (dd.MM.yyyy): ");
        Date dayOfBirth = new Date(SCANNER_STR.nextLine());
        System.out.print("Enter hiringDate (dd.MM.yyyy): ");
        Date hiringDate = new Date(SCANNER_STR.nextLine());
        System.out.println("\t" + "* ALL VACATION DAYS SUM (excluding extra days): " + holidaysPreview(hiringDate) + " days");
        System.out.print("Enter the amount of used holiday days by " + name + " " + lastname + " : ");
        int holidaysAlreadyTaken = SCANNER_INT.nextInt();
        EMPLOYEE_LIST.add(new SalaryEmployee(name, lastname, dayOfBirth, hiringDate,holidaysAlreadyTaken));
        print(" *** Employee was created successfully! ***");
    }

    // create new Manager object
    public static void createManager() {
        System.out.println("\t" + " * CREATE NEW MANAGER ->");
        System.out.print("Enter name: ");
        String name = SCANNER_STR.nextLine();
        System.out.print("Enter lastname: ");
        String lastname = SCANNER_STR.nextLine();
        System.out.print("Enter dayOfBirth (dd.MM.yyyy): ");
        Date dayOfBirth = new Date(SCANNER_STR.nextLine());
        System.out.print("Enter hiringDate (dd.MM.yyyy): ");
        Date hiringDate = new Date(SCANNER_STR.nextLine());
        System.out.println("\t" + "* ALL VACATION DAYS SUM (excluding extra days): " + holidaysPreview(hiringDate) + " days");
        System.out.print("Enter the amount of used holiday days by " + name + " " + lastname + " : ");
        int holidaysAlreadyTaken = SCANNER_INT.nextInt();
        EMPLOYEE_LIST.add(new Manager(name, lastname, dayOfBirth, hiringDate, holidaysAlreadyTaken));
        print(" *** Employee was created successfully! ***");
    }

    // display sum of all vacation days (excluding 50+ years old extra days)
    public static int holidaysPreview(Date hiringDate) {
        return (int) (DateCalc.calcMonthsBetweenTodayDate(hiringDate) * 2.5);
    }

    // display all employee's
    public static void displayEmployee() {
        printLine();
        for (Employee employee : EMPLOYEE_LIST) {
                System.out.println(employee);
        }
        if (EMPLOYEE_LIST.size() == 0) {
            System.out.println("DATABASE IS EMPTY!");
        }
        printLine();
    }

    // search employee
    public static void searchEmployee() {
        if (EMPLOYEE_LIST.size() > 0) {
            boolean found = false;
            System.out.println("\t" + " * SEARCH EMPLOYEE MENU ->");
            System.out.print("Enter employee name or lastname for SEARCH: ");
            String searchQuery = SCANNER_STR.nextLine();
            printLine();
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
        }
        else {
            printLine();
            System.out.println("DATABASE IS EMPTY!");
        }
        printLine();
    }

    // take vacation
    public static void vacation() {
        if (EMPLOYEE_LIST.size() > 0) {
            boolean found = false;
            System.out.println("\t" + "* TAKE VACATION EMPLOYEE MENU ->");
            System.out.print("Enter employee lastname to add new vacation: ");
            String searchQuery = SCANNER_STR.nextLine();
            printLine();
            for (Employee e : EMPLOYEE_LIST) {
                if (e.getLastname().equalsIgnoreCase(searchQuery)) {
                    System.out.println("\t" + "* "+ e.getName() + " " + e.getLastname()
                            + " -> " + e.getHolidaysLeft() + " days left");
                    printLine();
                    System.out.println("\t" + "** Enter date range for vacation (from - to) in dd.MM.yyyy format-> ");
                    System.out.print("date1 - FROM: ");
                    Date date1 = new Date(SCANNER_STR.nextLine());
                    System.out.print("date2 - TO: ");
                    Date date2 = new Date(SCANNER_STR.nextLine());
                    e.takeVacation(date1, date2);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Record Not Found :(");
            }
        }
        else {
            printLine();
            System.out.println("DATABASE IS EMPTY!");
        }
        printLine();
    }

    // delete employee
    public static void deleteEmployee() {
        if (EMPLOYEE_LIST.size() > 0) {
            System.out.println("\t" + "* DELETE EMPLOYEE MENU ->");
            boolean found = false;
            System.out.print("Enter employee lastname to DELETE: ");
            String searchQuery = SCANNER_STR.nextLine();
            printLine();
            Iterator<Employee> i = EMPLOYEE_LIST.iterator();
            while (i.hasNext()) {
                Employee e = i.next();
                if (e.getLastname().equalsIgnoreCase(searchQuery)) {
                    System.out.println(e);
                    // delete confirmation
                    printLine();
                    System.out.print("Are you sure want to delete "
                            + e.getName() + " " + e.getLastname() + " from list? Y/N : ");
                    String confirm = SCANNER_STR.nextLine();
                    // delete confirm
                    if (confirm.equalsIgnoreCase("y")) {
                        i.remove();
                        printLine();
                        System.out.println("Record: " + e.getName() + " " + e.getLastname() + " DELETED successfully!");
                        found = true;
                    }
                    // delete cancel
                    else if (confirm.equalsIgnoreCase("n")){
                        found = true;
                        break;
                    } else {
                        // output exception if option not 'y' or 'n'
                        throw new IllegalArgumentException("Option with selected value = " + confirm + " not found!");
                    }
                }
            }
            if (!found) {
                System.out.println("Record Not Found :(");
            }
        }
        // if database is empty print result
        else {
            printLine();
            System.out.println("DATABASE IS EMPTY!");
        }
        printLine();
    }

    // make beauty
    public static void print (String s) {
        String line1 = "----------------------------------------------------";
        String line2 = "|%-50s|\n";
        System.out.println(line1);
        System.out.printf(line2, s);
        System.out.println(line1);
    }

    // make beauty (just draw a line)
    public static void printLine() {
        System.out.println("-----------------------------------------------------------------------------------------");
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
                throw new IllegalArgumentException("Option with selected value= " + value + " not found");
        }
    }

    // employee type menu list
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
            throw new IllegalArgumentException("Option with selected value= " + value + " not found");
        }
    }

}