import java.util.Scanner;

public class String_Construction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = "";

            for (int i = 0; i < k + 1; i++) {
                s += '1';
            }

            for (int i = n - k; i < n; i++) {
                s += '0';
            }

            int no1 = 0;
            int no0 = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    no1++;
                } else {
                    no0++;
                }
            }

            if (Math.abs(no1 - no0) <= 1 && s.length() == n ) {
                System.out.println(s);
            } else {
                System.out.println("-1");
            }
        }

        sc.close();
    }
}