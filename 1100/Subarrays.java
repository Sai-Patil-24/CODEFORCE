
import java.util.*;

public class Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            int[] pref = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                pref[i] = (pref[i - 1] + a[i] % k) % k;
            }

            long[] freq = new long[k];
            long ans = 0;

            for (int j = 0; j <= n; j++) {
                int i = j - k - 1;

                if (i >= 0) {
                    freq[pref[i]]++;
                }

                ans += freq[pref[j]];
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
