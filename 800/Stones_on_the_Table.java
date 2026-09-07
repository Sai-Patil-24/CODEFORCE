import java.util.Scanner;

public class Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String s = scanner.next();
        
        int count = 0;
        
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
        }
        
        System.out.println(count);
        
        scanner.close();
    }
}