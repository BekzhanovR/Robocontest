import java.util.Scanner;

public class Main {
    public static String findSum(String str1, String str2){
        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        String str = "";
        int n1 = str1.length(), n2 = str2.length();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        sb1.reverse();
        sb2.reverse();

        int carry = 0;
        for (int i=0; i<n1; i++){
            int sum = ((sb1.charAt(i)-'0')+(sb2.charAt(i)-'0')+carry);
            str += (char)(sum%10 + '0');
            carry = sum/10;
        }
        for (int i=n1; i<n2; i++){
            int sum = ((sb2.charAt(i)-'0')+carry);
            str += (char)(sum%10 + '0');
            carry = sum/10;
        }
        if (carry > 0)
            str += (char)(carry+'0');
        StringBuilder result = new StringBuilder(str);
        result.reverse();
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String B = input.next();
        System.out.println(findSum(A, B));
    }
}