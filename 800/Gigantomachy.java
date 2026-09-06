import java.util.Scanner;

public class Gigantomachy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            // Read Bea's first mountain
            long a1 = sc.nextLong();
            // Skip the rest of Bea's mountains since they don't affect the math
            for (int i = 1; i < n; i++) {
                sc.nextLong();
            }
            
            // Read Ver's first mountain
            long b1 = sc.nextLong();
            // Skip the rest of Ver's mountains
            for (int i = 1; i < m; i++) {
                sc.nextLong();
            }
            
            // If Bea's total capacity is >= Ver's, Bea (1) wins. Else Ver (2) wins.
            if (a1 + n >= b1 + m) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        
        sc.close();
    }
}