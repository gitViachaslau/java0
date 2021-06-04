package by.basics.line.three;

import java.util.Scanner;

public class CalculationOfTheValue {
    public static void main (String[] args) {
        double x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value - X: ");
        x = in.nextDouble();
        System.out.println("Enter the value - Y: ");
        y = in.nextDouble();
        z =((Math.sin(x) + Math.cos(y)) / (Math.cos(x)) - Math.sin(y)) * Math.tan((x * y));
        System.out.println("Result: " + z);
    }
}
