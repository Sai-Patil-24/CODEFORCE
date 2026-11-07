
import java.util.*;

public class I_Know_About_a_Million_Things {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int odd = 0;
            int even = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            if ((odd == 1 && even == 1) ||
                (odd == 3 && even == 0)) {
                System.out.println("Larpity");
            } else {
                System.out.println("Moggity");
            }
        }

        sc.close();
    }
}
