import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] inputs = input.split(" ");
        long n = Long.parseLong(inputs[0]);
        long k = Long.parseLong(inputs[1]);

        long output;
        if (n == 0) {
            output = 1;
        } else {
            output = modularPow(k + 1, n, 1000000007);
        }

        System.out.println(output);
    }

    public static long modularPow(long baseNumber, long exponent, long modulus) {
        BigInteger result = BigInteger.ONE;
        BigInteger base = BigInteger.valueOf(baseNumber);
        BigInteger mod = BigInteger.valueOf(modulus);

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = result.multiply(base).mod(mod);
            }
            base = base.multiply(base).mod(mod);
            exponent /= 2;
        }

        return result.longValue();
    }
}