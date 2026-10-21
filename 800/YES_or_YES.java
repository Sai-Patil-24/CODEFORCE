import java.util.Scanner;
public class YES_or_YES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        if (s.equals("YES") || s.equals("yES") || s.equals("yes") || s.equals("Yes")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}