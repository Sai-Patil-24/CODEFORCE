import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next().toLowerCase();

        Set<Character> uniqueLetters = new HashSet<>();
        for (int i = 0; i < n; i++) {
            uniqueLetters.add(s.charAt(i));
        }

        if (uniqueLetters.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}