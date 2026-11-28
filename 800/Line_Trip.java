import java.util.Scanner;

public class Line_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                int x = sc.nextInt();
                
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                
                // Distance from 0 to the first gas station
                int maxTank = a[0];
                
                // Maximum distance between consecutive gas stations
                for (int i = 1; i < n; i++) {
                    maxTank = Math.max(maxTank, a[i] - a[i - 1]);
                }
                
                // Round-trip distance from the last gas station to x and back
                maxTank = Math.max(maxTank, 2 * (x - a[n - 1]));
                
                System.out.println(maxTank);
            }
        }
        
        sc.close();
    }
}