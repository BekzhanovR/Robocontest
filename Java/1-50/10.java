import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A, B, C, N, d;
        N = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        d = A + B + C;
        if (N <= d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}