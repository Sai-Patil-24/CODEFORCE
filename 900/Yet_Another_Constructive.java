
import java.util.*;

public class Yet_Another_Constructive  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            long m = sc.nextLong();

            if (k > m) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            for (int i = 0; i < n; i++) {

                if (i % k == 0) {
                    System.out.print((m - k + 1) + " ");
                } else {
                    System.out.print("1 ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
