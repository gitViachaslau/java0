package by.basics.line.six;

import java.util.Scanner;

public class PointInZone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double xStart, xFinish, yStart, yFinish, xDot, yDot;
        System.out.println("Enter X_start: ");
        xStart = in.nextDouble();
        System.out.println("Enter X_finish: ");
        xFinish = in.nextDouble();
        System.out.println("Enter Y_start: ");
        yStart = in.nextDouble();
        System.out.println("Enter Y_finish: ");
        yFinish = in.nextDouble();
        System.out.println("Map is initialized: X: " + xStart + " ~ " + xFinish + " Y: " + xStart +
                " - " + xFinish);
        System.out.println("Enter X_dot: ");
        xDot = in.nextDouble();
        System.out.println("Enter Y_dot: ");
        yDot = in.nextDouble();
        System.out.println((xDot >= xStart) && (xDot <= xFinish) && (yDot >= yStart) && (yDot <= yFinish));
    }
}
