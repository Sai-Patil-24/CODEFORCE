import java.util.*;

public class Codeforces_Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String word = "codeforces";

        while (t-- > 0) {
            char ch = sc.next().charAt(0);

            if (word.indexOf(ch) != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}