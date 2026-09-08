import java.util.Scanner;
public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        
        int cost =  0;
        for(int i = 1; i <= w; i++) {
            cost += k * i;
        }
        
        int borrow = Math.max(0, cost - n);
            System.out.println(borrow);
        
        scanner.close();
    }
}