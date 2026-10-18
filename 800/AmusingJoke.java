import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        char[] combined = (s1 + s2).toCharArray();
        char[] pile = s3.toCharArray();

        Arrays.sort(combined);
        Arrays.sort(pile);

        if (Arrays.equals(combined, pile)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}