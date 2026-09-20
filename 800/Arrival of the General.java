import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int maxVal = 0;
        int minVal = 101; 
        int maxIdx = 0;
        int minIdx = 0;
        
        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();
            
            if (height > maxVal) {
                maxVal = height;
                maxIdx = i;
            }
            
            if (height <= minVal) {
                minVal = height;
                minIdx = i;
            }
        }
        
        int swaps = maxIdx + (n - 1 - minIdx);
        
        if (maxIdx > minIdx) {
            swaps--;
        }
        
        System.out.println(swaps);
        scanner.close();
    }
}