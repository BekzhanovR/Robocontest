import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a, b, c, d, e, mn, mx;

        a = scanner.nextLong();
        b = scanner.nextLong();
        c = scanner.nextLong();
        d = scanner.nextLong();
        e = scanner.nextLong();

        mn = Math.min(Math.min(a, b), Math.min(c, Math.min(d, e)));
        mx = Math.max(Math.max(a, b), Math.max(c, Math.max(d, e)));

        System.out.println((a + b + c + d + e - mx) + " " + (a + b + c + d + e - mn));
    }
}
