import java.util.Scanner;

public class CarrotChopdownEasyVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] count = new int[m + 1];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                count[a]++;
            }

            // suffix[x] = how many carrots have length >= x
            int[] suffix = new int[m + 2];
            for (int x = m; x >= 1; x--) {
                suffix[x] = suffix[x + 1] + count[x];
            }

            int ans = 0;
            for (int x = 1; x <= m; x++) {
                int total = suffix[x];
                if (2 * x <= m) {
                    total += count[2 * x];
                }
                ans = Math.max(ans, total);
            }

            System.out.println(ans);
        }
    }
}