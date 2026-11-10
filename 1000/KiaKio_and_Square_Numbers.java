import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class KiaKio_and_Square_Numbers {
    // Function to calculate the sum of squares of digits
    static long next(long x) {
        long sum = 0;
        while (x > 0) {
            long d = x % 10;
            sum += d * d;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Long, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();

                // Simulating 200 steps ensures any number reaches its cycle 
                // and synchronizes to the exact same value if they are in tune.
                for (int step = 0; step < 200; step++) {
                    x = next(x);
                }

                // Count occurrences of each canonical end-state
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            // Count total pairs: count * (count - 1) / 2
            long ans = 0;
            for (int count : freq.values()) {
                ans += (long) count * (count - 1) / 2;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}