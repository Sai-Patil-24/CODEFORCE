import java.util.Scanner;

public class T_Primes {
    
    public static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            long num = sc.nextLong(); 
            long root = (long) Math.sqrt(num);
            
            if (root * root == num && isPrime(root)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}