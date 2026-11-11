
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            if (n < 2 * m) {
                System.out.println("NO");
                continue;
            }

            int i = 0;
            boolean possible = true;

            for (int j = 0; j < m; j++) {

                // Need a smaller element
                if (i >= n || a[i] > b[j]) {
                    possible = false;
                    break;
                }

                // Consume elements until we find
                // one greater than b[j]
                while (i < n && a[i] < b[j]) {
                    i++;
                }

                // Check whether a greater element exists
                if (i >= n) {
                    possible = false;
                    break;
                }

                // Consume the greater element
                i++;
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
