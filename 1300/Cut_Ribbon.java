import java.util.Scanner;

public class Cut_Ribbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();   
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int maxPieces = 0;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int remainingLength = n - (i * a + j * b);
                
                if (remainingLength < 0) {
                    continue;
                }
                
                if (remainingLength % c == 0) {
                    int k = remainingLength / c;
                    int totalPieces = i + j + k;
                    
                    if (totalPieces > maxPieces) {
                        maxPieces = totalPieces;
                    }
                }
            }
        }
        
        System.out.println(maxPieces);
    }
}