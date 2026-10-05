import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() == 1) {
                System.out.println("HARD");
                return;
            }
        }
        
        System.out.println("EASY");
    }
}