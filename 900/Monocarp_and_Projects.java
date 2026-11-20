import java.util.Scanner;

public class Monocarp_and_Projects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long x = sc.nextLong(); // employees
            long y = sc.nextLong(); // projects
            long k = sc.nextLong(); // tasks

            long d = y - x;
            long mono = 0;
            long i = 0;

            // Only loop while employees <= difference (at most y - x iterations)
            while (i < k && (x + i) <= d) {
                mono += d % (x + i);
                i++;
            }

            // For all remaining months, (y + i) % (x + i) is always equal to d
            if (i < k) {
                mono += (k - i) * d;
            }

            System.out.println(mono);
        }
    }
}