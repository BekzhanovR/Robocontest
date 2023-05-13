import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        String x;
        if (a > b) {
            x = ">";
        } else if (a == b) {
            x = "=";
        } else {
            x = "<";
        }

        System.out.println(x);
        scanner.close();
    }
}
