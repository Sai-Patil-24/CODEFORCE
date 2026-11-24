import java.util.Scanner;

public class EzraftAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println(1);
            } else if (n == 2) {
                System.out.println(-1);
            } else {
                System.out.print("1 2 ");
                long current = 3;
                for (int i = 3; i <= n; i++) {
                    System.out.print(current + " ");
                    current *= 2;
                }
                System.out.println();
            }
        }
    }
}