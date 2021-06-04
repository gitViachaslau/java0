package by.basics.cycles.two;

import java.util.Scanner;

public class Func {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, h;
        System.out.println("Enter start number: ");
        a = in.nextInt();
        System.out.println("Enter end number: ");
        b = in.nextInt();
        System.out.println("Enter h: ");
        h = in.nextInt();
        System.out.println("a = " + a + "  b = " + b + "  h = " + h);
        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                System.out.println("  " + i + "  ");
            }
            else {
                System.out.println("  " + -i + "  ");
            }
        }
    }
}
