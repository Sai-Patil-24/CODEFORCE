import java.util.*;

public class Riptide {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int[] x = {a, b, c};

            Arrays.sort(x);

            int answer = Math.min(x[1] - x[0], x[2] - x[1]);

            System.out.println(answer);
        }

        sc.close();
    }
}