import java.util.Scanner;

public class Domino_piling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        System.out.println((M * N) / 2);
    }
}