import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int val = scanner.nextInt();
                if (val == 1) {
                    // Calculate Manhattan distance to the center (3, 3)
                    int moves = Math.abs(i - 3) + Math.abs(j - 3);
                    System.out.println(moves);
                    
                    // Close scanner and exit since we found the 1
                    scanner.close();
                    return; 
                }
            }
        }
    }
}