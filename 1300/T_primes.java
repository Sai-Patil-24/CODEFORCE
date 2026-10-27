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


//OPtimized version
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int limit = 1000000;
        boolean[] isPrime = new boolean[limit + 1];
        
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }
        
        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(st.nextToken());
            long root = (long) Math.sqrt(num);
            
            if (root * root == num && isPrime[(int) root]) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        
        System.out.print(sb);
    }
}