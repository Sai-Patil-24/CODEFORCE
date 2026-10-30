import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a <= b) {
                System.out.println(-1);
            } else {
                int Sandwiches = Math.min(b, a - b);
                System.out.println(Sandwiches);
            }
        }
        
        sc.close();
    }
}