import java.util.Scanner;

public class YES_or_YES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            sc.nextLine(); 
            
            while (t-- > 0) {
                String s = sc.nextLine();
                
                if (s.toUpperCase().equals("YES")) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        
        sc.close();
    }
}