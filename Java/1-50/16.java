import java.util.Scanner;

public class Main {
    private static String son(long n) {
        switch ((int) n) {
            case 1:
                return "bir";
            case 2:
                return "ikki";
            case 3:
                return "uch";
            case 4:
                return "to'rt";
            case 5:
                return "besh";
            case 6:
                return "olti";
            case 7:
                return "yetti";
            case 8:
                return "sakkiz";
            case 9:
                return "to'qqiz";
            case 10:
                return "o'n";
            case 20:
                return "yigirma";
            case 30:
                return "o'ttiz";
            case 40:
                return "qirq";
            case 50:
                return "ellik";
            case 60:
                return "oltmish";
            case 70:
                return "yetmish";
            case 80:
                return "sakson";
            case 90:
                return "to'qson";
            case 100:
                return "yuz";
            case 1000:
                return "ming";
            case 1000000:
                return "million";
            case 1000000000:
                return "milliard";
            default:
                return "";
        }
    }

    private static String maydala(int n) {
        String satr = "";
        satr = son(n % 10) + satr;
        if (n % 100 / 10 != 0) {
            if (!satr.equals("")) satr = " " + satr;
            satr = son(n % 100 / 10 * 10) + satr;
        }
        if (n >= 100) {
            if (!satr.equals("")) satr = " " + satr;
            satr = son(n / 100) + " yuz" + satr;
        }
        return satr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        long n = scanner.nextLong();
        int i = 0;
        String satr = "";
        String maydaSatr;
        while (n != 0) {
            arr[i] = (int) (n % 1000);
            n /= 1000;
            i++;
        }
        String[] javob = new String[i];
        for (int j = 0; j < i; j++) {
            maydaSatr = "";
            maydaSatr = maydala(arr[j]);
            if (j != 0 && j != 3 && arr[j] != 0) maydaSatr += " " + son((int) Math.pow(10, j * 3)) + " ";
            if (j == 3) maydaSatr += " " + son((int) Math.pow(10, 3 * 3)) + " ";
            satr = maydaSatr + satr;
        }
        System.out.println(satr);
    }
}