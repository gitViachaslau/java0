package by.basics.branching.one;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double angleOne, angleTwo;
        int sumOfAnglesForATriangle = 180;
        System.out.println("Enter angle one (only positive number) :");
        angleOne = Math.abs(in.nextDouble());
        System.out.println("Enter angle two (only positive number) :");
        angleTwo = Math.abs(in.nextDouble());
        if ((angleOne + angleTwo) < sumOfAnglesForATriangle) {
            System.out.println("Triangle can be created !");
        }
        else
            System.out.println("Sorry, triangle cannot be created !");
    }
}
