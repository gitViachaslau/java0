package by.basics.cycles.four;
import java.math.BigInteger;

public class Sum {
    public static void main(String[] args) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            long a = (long) Math.pow(i, 2);
            BigInteger x = BigInteger.valueOf(a);
            result = result.multiply(x);
        }
        System.out.println(result);
    }
}
