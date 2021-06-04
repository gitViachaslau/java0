package by.basics.branching.two;

import java.util.Scanner;

public class NumberMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        int a, b, c, d;
        System.out.println("Enter number A: ");
        a = in.nextInt();
        System.out.println("Enter number B: ");
        b = in.nextInt();
        System.out.println("Enter number C: ");
        c = in.nextInt();
        System.out.println("Enter number D: ");
        d = in.nextInt();

        if (a <= b) {
            numberOne = a;
        }
        else {
            numberOne = b;
        }

        if (c <= d) {
            numberTwo = c;
        }
        else {
            numberTwo = d;
        }

        if (numberOne >= numberTwo) {
            System.out.println("Result: " + numberOne);
        }
        else {
            System.out.println("Result: " + numberTwo);
        }
    }
}
