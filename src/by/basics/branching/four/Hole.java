package by.basics.branching.four;

import java.util.Scanner;

public class Hole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, x, y, z;
        System.out.println("Hole size:");
        System.out.println("Enter A: ");
        a = in.nextInt();
        System.out.println("Enter B: ");
        b = in.nextInt();
        System.out.println("Brick size:");
        System.out.println("Enter X: ");
        x = in.nextInt();
        System.out.println("Enter Y: ");
        y = in.nextInt();
        System.out.println("Enter Z: ");
        z = in.nextInt();

        if (((x <= a) && (y <= b)) || ((y <= a) && (x <= b)) || ((x <= a) && (z <= b)) ||
                ((z <= a) && (x <= b)) || ((z <= a) && (y <= b)) || ((y <= a) && (z <= b))) {
            System.out.println("Size match !");
        }

        else {
            System.out.println("Sorry! Hole is small");
        }


    }
}
