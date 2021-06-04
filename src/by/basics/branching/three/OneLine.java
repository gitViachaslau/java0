package by.basics.branching.three;

import java.util.Scanner;

public class OneLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1, x2, x3, y1, y2, y3;
        System.out.println("Enter X1: ");
        x1 = in.nextInt();
        System.out.println("Enter Y1: ");
        y1 = in.nextInt();
        System.out.println("Enter X2: ");
        x2 = in.nextInt();
        System.out.println("Enter Y2: ");
        y2 = in.nextInt();
        System.out.println("Enter X3: ");
        x3 = in.nextInt();
        System.out.println("Enter Y3: ");
        y3 = in.nextInt();

        System.out.println("A (" + x1 + ", " + y1 + "),  " + "B (" + x2 + ", " + y2 + "),  " +
                "C (" + x3 + ", " + y3 + "),  ");

        if (((x1 == x2) && ( x2 == x3)) || ((y1 == y2) && (y2 == y3))) {
            System.out.println("Error! All points have the same address");
            return;
        }

        if (((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1))) {
            System.out.println("Points on the same line");
        }
        else {
            System.out.println("Sorry, dots are not on the same line");
        }
    }
}
