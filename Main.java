import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            // put them in order: small, mid, large
            long small = Math.min(a, Math.min(b, c));
            long large = Math.max(a, Math.max(b, c));
            long mid = a + b + c - small - large; // whatever is left

            long answer;
            if (large > small + mid) {
                answer = mid; // replacing large with (small+mid) is better
            } else {
                answer = large - small; // can't improve
            }

            System.out.println(answer);
        }
    }
}   