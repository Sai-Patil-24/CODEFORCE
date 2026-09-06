import java.util.Scanner;

public class Evanescent{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int L = 1;
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    L++;
                }
            }
            
            int min_L = L;
            for (int i = 1; i < n - 1; i++) {
                int old_trans = (s.charAt(i - 1) != s.charAt(i) ? 1 : 0) + 
                                (s.charAt(i) != s.charAt(i + 1) ? 1 : 0);
                int new_trans = (s.charAt(i - 1) != s.charAt(i + 1) ? 1 : 0);
                min_L = Math.min(min_L, L - old_trans + new_trans);
            }
            
            System.out.println(min_L);
        }
        sc.close();
    }
}