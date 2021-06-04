package by.basics.cycles.five;

import java.util.Scanner;

public class Row {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m;
        double result = 0, e;
        System.out.println("Enter m: ");
        m = in.nextInt();
        System.out.println("Enter n: ");
        n = in.nextInt();
        System.out.println("Enter e: ");
        e = in.nextDouble();
        for (int i = 2; i <= m; i++ ) {
            double temp = Math.abs((1/Math.pow(i, n)));
            if (temp >= e) {
                result += temp;
            }
        }
        System.out.println("Result = " + result);
    }
}
