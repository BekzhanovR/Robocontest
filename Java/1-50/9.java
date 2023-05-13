import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] s = scanner.nextLine().split(" ");
        int[] sInt = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            sInt[i] = Integer.parseInt(s[i]);
        }

        for (int val : sInt) {
            int count = 0;
            for (int num : sInt) {
                if (val == num) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(val);
            }
        }
    }
}
