import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();
        
        long stonesN = (n + a - 1) / a;
        long stonesM = (m + a - 1) / a;
        
        long totalStones = stonesN * stonesM;
        
        System.out.println(totalStones);
        
        scanner.close();
    }
}