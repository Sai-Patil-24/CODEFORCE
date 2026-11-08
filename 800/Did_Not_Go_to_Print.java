import java.util.Scanner;

public class Did_Not_Go_to_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int[] stack = new int[n];
            int top = 0;
            boolean[] printed = new boolean[n + 1];

            for (int i = 0; i < n; i++) {
                int doc = i + 1;
                char c = s.charAt(i);

                if (c == '1') {
                    stack[top++] = doc;
                } else if (c == '2') {
                    if (top > 0) {
                        printed[stack[--top]] = true;
                    } else {
                        printed[doc] = true;
                    }
                } else if (c == '3') {
                    printed[doc] = true;
                }
            }

            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (!printed[i]) count++;
            }

            System.out.println(count);
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (!printed[i]) {
                    sb.append(i).append(" ");
                }
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            System.out.println(sb.toString());
        }
    }
}