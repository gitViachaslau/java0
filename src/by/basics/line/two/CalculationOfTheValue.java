package by.basics.line.two;

import java.util.Scanner;
import java.lang.Math;

public class CalculationOfTheValue {
    public static void main(String[] args) {
        double a, b, c, z;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value - A: ");
        a = check(in.nextDouble());
        System.out.println("Enter the value - B: ");
        b = in.nextDouble();
        System.out.println("Enter the value - C: ");
        c = in.nextDouble();
        z = ((b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c))) / 2 * a) - (Math.pow(a, 3) * c + Math.pow(b, -2));
        System.out.println("Result: " + z);
    }

    static double check (double x) {
        if (x != 0) {
            return x;
        }
        do {
            System.out.println("The value cannot be 0. Please try again");
            Scanner in = new Scanner(System.in);
            x = in.nextDouble();
        } while (x == 0);
        return x;
    }
}
