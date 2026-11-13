
import java.util.*;

public class Merge_to_Match  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            // Input array a
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Input array b
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            // Sort both arrays
            Arrays.sort(a);
            Arrays.sort(b);

            // Check minimum elements required
            if (n < 2 * m) {
                System.out.println("NO");
                continue;
            }

            boolean possible = true;

            // Check smaller and greater elements
            for (int i = 0; i < m; i++) {

                if (a[i] >= b[i] ||
                    a[n - m + i] <= b[i]) {

                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
