package by.basics.cycles.one;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number, result = 0;
        System.out.println("Enter number: ");
        number = Math.abs(in.nextInt());
        for (int i = 1; i < number; i++) {
            result += i;
        }
        System.out.println("Result: " + result);
    }
}
