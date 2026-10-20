import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Anton_and_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        Set<Character> uniqueLetters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                uniqueLetters.add(c);
            }
        }
        
        System.out.println(uniqueLetters.size());
        sc.close();
    }
}