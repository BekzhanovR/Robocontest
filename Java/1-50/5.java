import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        int s = 0;
        int n = 0;

        if (z == 0) {
            s = -1;
        } else {
            if (z < 0) {
                n = -z;
            } else {
                n = z;
            }

            int i = 1;

            while (i * i <= n) {
                if (n % i == 0) {
                    s += 1;

                    if (i * i != n) {
                        s += 1;
                    }
                }

                i += 1;
            }

            if (s % 2 == 1 && z > 0) {
                s += 1;
            }
        }

        System.out.println(s);
    }
}