
import java.util.Scanner;

public class Hypercarp_and_the_Control_Panel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int TestsNumT = sc.nextInt();

        while (TestsNumT-- > 0) {

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] color = new int[n];
            int[] freq = new int[n];

            int i = 0;
            int j = 0;
            int groups = 0;

            while (j < n) {

                i = j;

                while (j < n && a[i] == a[j]) {
                    j++;
                }

                color[groups] = a[i];
                freq[groups] = j - i;

                groups++;
            }

            int ans = groups;

            for (i = 0; i < groups - 1; i++) {

                if (freq[i] >= 2 && freq[i + 1] >= 2) {
                    ans = groups + 2;
                    break;
                }
            }

            if (ans == groups) {

                for (i = 0; i < groups; i++) {

                    if (freq[i] < 2) {
                        continue;
                    }

                    boolean right = i + 1 < groups &&
                            (i + 2 >= groups ||
                            color[i] != color[i + 2]);

                    boolean left = i > 0 &&
                            (i < 2 ||
                            color[i] != color[i - 2]);

                    if (right || left) {
                        ans = groups + 1;
                        break;
                    }
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
