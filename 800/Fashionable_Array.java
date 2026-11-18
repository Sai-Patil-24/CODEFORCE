import java.util.Scanner;

public class Fashionable_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] freq = new int[101]; // Constraints: 1 <= a_i <= 100
            
            for (int i = 0; i < n; i++) {
                freq[sc.nextInt()]++;
            }
            
            int placed = 0;
            while (placed < n) {
                for (int val = 100; val >= 1; val--) {
                    if (freq[val] > 0) {
                        out.append(val).append(' ');
                        freq[val]--;
                        placed++;
                    }
                }
            }
            out.append('\n');
        }
        
        System.out.print(out);
    }
}