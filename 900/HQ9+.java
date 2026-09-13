import java.util.Scanner;
public class HQ9Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        for (char c : input.toCharArray()) {
            if (c == 'H' || c == 'Q' || c == '9') {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        sc.close();

    }
}