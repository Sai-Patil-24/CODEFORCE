import java.util.Scanner;
public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n / 2; i++) {
            sum1 += s.charAt(i) - '0';
            sum2 += s.charAt(n - 1 - i) - '0';
        }

        if (sum1 == sum2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}