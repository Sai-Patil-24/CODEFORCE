import java.util.*;

public class Delete_and_Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            int minOps = (n + 1) / 2;
            long score = 0;

            // Must take the top ceil(n / 2) largest elements
            for (int i = n - 1; i >= n - minOps; i--) {
                score += a[i] - c;
            }

            // Take remaining elements only if they increase the score
            for (int i = n - minOps - 1; i >= 0; i--) {
                if (a[i] - c > 0) {
                    score += a[i] - c;
                }
            }

            System.out.println(score);
        }

        sc.close();
    }
}