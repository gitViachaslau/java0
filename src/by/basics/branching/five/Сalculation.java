package by.basics.branching.five;

import java.util.Scanner;

public class Сalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        double result;
        System.out.println("Enter X:");
        x = in.nextInt();
        if (x <= 3) {
            System.out.println("X <= 3, Version 1");
            result = Math.pow(x, 2) - (3 * x) + 9;
        }
        else {
            System.out.println("X > 3, Version 2");
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("Result: " + result);
    }
}
