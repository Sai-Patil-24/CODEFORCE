import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int availableRooms = 0;
        
        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            
            if (q - p >= 2) {
                availableRooms++;
            }
        }
        
        System.out.println(availableRooms);
        scanner.close();
    }
}