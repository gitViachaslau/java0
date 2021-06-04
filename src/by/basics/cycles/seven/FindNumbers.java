package by.basics.cycles.seven;

import java.util.Scanner;

public class FindNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, n;
        boolean status;
        System.out.println("Enter m: ");
        m = in.nextInt();
        System.out.println("Enter n: ");
        n = in.nextInt();
        for (int i = m; i <= n; i++) {
            status = false;
            System.out.println("Number: " + i);
            for (int a = 2; a < i; a++) {
                if (i % a == 0) {
                    status = true;
                    System.out.printf(a + ", ");
                }
            }
            if (!status) {
                System.out.println("Not found");
            }
            System.out.println("\n");
        }
    }
}
