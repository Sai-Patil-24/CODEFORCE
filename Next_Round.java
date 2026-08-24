import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] scores = new int[n];
        
        // Read the scores
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        
        // The threshold score is at index k-1
        int threshold = scores[k - 1];
        int count = 0;
        
        // Check how many participants meet the criteria
        for (int i = 0; i < n; i++) {
            if (scores[i] >= threshold && scores[i] > 0) {
                count++;
            } else {
                // Since the array is non-increasing, we can stop early 
                // if a score is less than the threshold
                break;
            }
        }
        
        System.out.println(count);
        scanner.close();
    }
}