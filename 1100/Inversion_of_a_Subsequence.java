import java.util.*;

public class Inversion_of_a_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            int onesA = 0, onesB = 0, x = 0;
            boolean same = true;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) onesA++;
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if (b[i] == 1) onesB++;
                if (a[i] != b[i]) same = false;
                if (a[i] == 1 && b[i] == 0) x++;
            }

            if (same) {
                System.out.println(0);
            } else if (x % 2 == 1) {
                System.out.println(1);
            } else if (onesA > 0 && onesB < n) {
                System.out.println(2);
            } else {
                System.out.println(-1);
            }
        }
    }
}