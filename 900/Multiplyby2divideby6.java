import java.util.Scanner;

public class Multiplyby2divideby6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            int moves = 0;

            while (n > 1) {
                if (n % 6 == 0) {
                    n /= 6;
                } else if (n % 3 == 0) {
                    n *= 2;
                } else {
                    moves = -1;
                    break;
                }
                moves++;
            }

            System.out.println(moves);
        }
    }
}