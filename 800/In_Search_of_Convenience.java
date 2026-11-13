import java.util.Scanner;

public class In_Search_of_Convenience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            int r = sc.nextInt();

            boolean found = false;
            for (int i = x0 - r; i <= x0 + r && !found; i++) {
                for (int j = y0 - r; j <= y0 + r; j++) {
                    if ((i - x0) * (i - x0) + (j - y0) * (j - y0) == r * r) {
                        System.out.println(i + " " + j);
                        found = true;
                        break;
                    }
                }
            }
        }
    }
}