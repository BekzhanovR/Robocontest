import java.util.Scanner;

public class Main {
    public static int fff(int n) {
        int s = 0, p;
        while (n > 0) {
            p = n % 10;
            s = s + p;
            n = n / 10;
        }
        return s * s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        int i = 1, h = 0;
        while (k < n) {
            if (i % fff(i) == 0)
                k++;
            h = i;
            i++;
        }
        System.out.println(h);
    }
}