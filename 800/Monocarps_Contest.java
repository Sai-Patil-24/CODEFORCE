import java.util.Scanner;

public class Monocarps_Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int zeros = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    zeros++;
                }
            }

            if (zeros < 2) {
                System.out.println(-1);
            } else {
                int ops = 0;
                if (arr[0] == 1) ops++;
                if (arr[n - 1] == 1) ops++;
                System.out.println(ops);
            }
        }
    }
}