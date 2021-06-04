package by.basics.cycles.three;

public class Sum {
    public static void main(String[] args) {
        int a = 100;
        int result = 0;
        for (int i = 0; i <= a; i++) {
            result += Math.pow(i, 2);
        }
        System.out.println("Result = " + result);
    }
}
