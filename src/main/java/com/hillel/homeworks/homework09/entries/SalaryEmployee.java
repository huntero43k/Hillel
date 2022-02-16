package com.hillel.homeworks.homework09.entries;
/**
 * This Class extends from Employee and contain:
 * ■ few additional unique fields: employeeType, annualSalary;
 * ■ Overridden toString method
 */

import com.hillel.homeworks.homework09.utils.Date;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class SalaryEmployee extends Employee{

    /**
     * This is fields where we will store our values:
     *      @see #employeeType field is used to display the type of our object;
     *      @see #annualSalary will be used in the future when methods for calculating
     *      payroll will be described (this functionality not realized yet, so we put 0 value)
     */
    String employeeType;
    double annualSalary = 0;

    /**
     * This is a constructor to initialize SalaryEmployee objects
     * @param name set an initial employee name
     * @param lastname set an initial employee lastname
     * @param dayOfBirth set date of birth
     * @param hiringDate set the date of hire
     * @param holidaysAlreadyTaken this value set already taken holidays
     * @see Employee#takeVacation(int) using for initialize new SalaryEmployee already taken holidays
     * @see #employeeType using to set employee type of new object (only for convenience)
     */
    public SalaryEmployee(String name, String lastname, Date dayOfBirth, Date hiringDate, int holidaysAlreadyTaken) {
        super(name, lastname, dayOfBirth, hiringDate);
        this.takeVacation(holidaysAlreadyTaken);
        this.employeeType = "Salary Employee";
    }

    /**
     * Overridden method that displays the main properties of our object in the form we need.
     * @return display the properties of an object such as: full_name, age, vacation days left, employee type
     */
    @Override
    public String toString() {
        return super.toString() + "\t" + "TYPE: "+ employeeType + " |";
    }
}