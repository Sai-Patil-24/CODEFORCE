public import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        
        String reversed = new StringBuilder(s).reverse().toString();
        
        if (reversed.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
