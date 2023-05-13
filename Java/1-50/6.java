import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jil;
        String x = "";

        jil = Integer.parseInt(scanner.nextLine());

        if (jil < 10) {
            x = "000";
        } else if (jil < 100) {
            x = "00";
        } else if (jil < 1000) {
            x = "0";
        }

        if (jil % 400 == 0 || (jil % 4 == 0 && jil % 100 != 0)) {
            x = "12/09/" + x + jil;
        } else {
            x = "13/09/" + x + jil;
        }

        System.out.println(x);
    }
}