import java.util.Scanner;

public class The_Best_Card {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int target = n + 1;
            boolean isPrime = true;

            for (int i = 2; i * i <= target; i++) {
                if (target % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}