import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }

        Arrays.sort(s);

        int max = s[n - 1];
        int newMax = s[n - 2];
        for (int i = n - 3; i >= 0; i--) {
            if (s[i] > newMax) {
                newMax = s[i];
            }
        }

        System.out.println(newMax);
    }
}