import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long[] f = new long[46];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= 45; i++) {
            f[i] = f[i - 2] + f[i - 1];
        }

        long result = f[n] * 2;
        System.out.println(result);
    }
}
