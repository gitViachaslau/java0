package by.basics.line.four;

public class ReplacementOfPositions {
    public static void main(String[] args) {
        double r = 123.456;
        System.out.println("Input data: " + r);
        System.out.println("Result change: " + change(r));
    }

    static double change (double r) {
        int temp = (int) (r * 1000);
        double resulLeft, resultRight;
        resulLeft = (double) ((int) r) / 1000;
        resultRight = (double) temp % 1000;
        return (resulLeft + resultRight);
    }
}
