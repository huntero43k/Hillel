package com.hillel.homeworks.homework09.entries;

import com.hillel.homeworks.homework09.utils.Date;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Manager extends Employee{

    /**
     * This is fields where we will store our values:
     *      - employeeType filed is used to display the type of our object;
     *      - profitSharing field will be used in the future when methods for calculating
     * payroll will be described (this functionality is not yet implemented, so we set 0 value)
     */
    String employeeType;
    double profitSharing = 0;

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
    public Manager(String name, String lastname, Date dayOfBirth, Date hiringDate, int holidaysAlreadyTaken) {
        super(name, lastname, dayOfBirth, hiringDate);
        this.takeVacation(holidaysAlreadyTaken);
        this.employeeType = "Manager";
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