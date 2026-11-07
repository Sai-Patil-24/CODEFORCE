import java.util.Scanner;
public class Knife_s_Pill_Farm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // Implementation for Knife's Pill Farm logic
            int pill = 0;
            for (int i = 0; i < n; i++) {
               for(int j = 0; j < m; j++) {
                   
                   pill = j*a[j]-a[j-1];

               }
            }
            System.out.println(pill);
        }
        sc.close();
    }
}