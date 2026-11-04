import java.util.*;

public class Turn_Into_a_Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();

            int i = 0;
            int j = n - 1;
            int op = 0;

            boolean possible = true;

            while (i < j) {

                if (s.charAt(i) == s.charAt(j)) {
                    i++;
                    j--;
                }
                else if (s.charAt(i) == c) {
                    i++;
                    j--;
                    op++;
                }
                else if (s.charAt(j) == c) {
                    i++;
                    j--;
                    op++;
                }
                else {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? op : -1);
        }

        sc.close();
    }
}