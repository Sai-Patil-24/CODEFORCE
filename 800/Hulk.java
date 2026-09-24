import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print("I hate");
            } else {
                System.out.print("I love");
            }
            
            if (i == n) {
                System.out.print(" it\n");
            } else {
                System.out.print(" that ");
            }
        }
        
        scanner.close();
    }
}