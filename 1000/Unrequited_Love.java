
import java.util.*;

public class Unrequited_Love {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Calculate love of every triad
            int[] love = new int[n - 4];

            for (int i = 0; i < n - 4; i++) {
                love[i] = a[i] + a[i + 2] - a[i + 4];
            }

            long count = 0;

            // Compare every pair of triads
            for (int i = 0; i < n - 4; i++) {

                for (int j = i + 1; j < n - 4; j++) {

                    // Check equal audience love
                    if (love[i] == love[j]) {

                        // Check whether they share any keys
                        if (j - i != 2 && j - i != 4) {
                            count++;
                        }
                    }
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
