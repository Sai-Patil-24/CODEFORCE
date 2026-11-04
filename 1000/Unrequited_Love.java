
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

            int m = n - 4;

            int[] love = new int[m];

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < m; i++) {

                love[i] = a[i] + a[i + 2] - a[i + 4];

                map.put(love[i],
                        map.getOrDefault(love[i], 0) + 1);
            }

            long ans = 0;

            for (int freq : map.values()) {
                ans += (long) freq * (freq - 1) / 2;
            }

            for (int i = 0; i < m; i++) {

                if (i + 2 < m && love[i] == love[i + 2]) {
                    ans--;
                }

                if (i + 4 < m && love[i] == love[i + 4]) {
                    ans--;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
