package com.hillel.homeworks.homework07.task6.solution2;
/*********************************************************************************
 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a    *
 * 2 * 2 system of linear equations:                                              *
 *                                                                                *
 *  ax + by = e, cx + dy = f; x = (ed - bf) / (ad - bc) y = (af - ec) / (ad - bc) *
 *                                                                                *
 * The class contains:                                                            *
 * ■ Private data fields a, b, c, d, e, and f.                                    *
 * ■ A constructor with the arguments for a, b, c, d, e, and f.                   *
 * ■ Six getter methods for a, b, c, d, e, and f.                                 *
 * ■ A method named isSolvable() that returns true if ad - bc is not 0.           *
 * ■ Methods getX() and getY() that return the solution for the equation.         *
 *                                                                                *
 * This program prompts the user to enter a, b, c, d, e, and f and displays the   *
 * result. If ad - bc is 0, report that “The equation has no solution.”           *
 *********************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        // Create a LinearEquation object
        LinerEquation linearEquation = new LinerEquation(a, b, c, d, e, f);

        // Display results
        if (linearEquation.isSolvable()) {
            System.out.println("x is " + linearEquation.getX() +
                    " and y is " + linearEquation.getY());
        }
        else
            System.out.println("The equation has no solution.");
    }
}

