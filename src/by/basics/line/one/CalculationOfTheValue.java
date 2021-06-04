package by.basics.line.one;

import java.util.Scanner;

public class CalculationOfTheValue {
    public static void main (String[] args) {
        double a, b, c, z;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value - A: ");
        a = in.nextDouble();
        System.out.println("Enter the value - B: ");
        b = in.nextDouble();
        System.out.println("Enter the value - C: ");
        c = in.nextDouble();
        z = ((a - 3) * b / 2) + c;
        System.out.println("Result: " + z);
    }
}