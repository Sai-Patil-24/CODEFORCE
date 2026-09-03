import java.util.*;

public class String_Construction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

          
            if (k == n - 1) {
                System.out.println(-1);
                continue;
            }

            int ones = (n + 1) / 2;
            int zeros = n / 2;

            int blocks = n - k;

            int oneBlocks = (blocks + 1) / 2;
            int zeroBlocks = blocks / 2;

          
            int firstOneBlock = ones - oneBlocks + 1;
            int firstZeroBlock = zeros - zeroBlocks + 1;

            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < blocks; i++) {

                if (i % 2 == 0) {
                    
                    int cnt = (i == 0) ? firstOneBlock : 1;

                    for (int j = 0; j < cnt; j++) {
                        ans.append('1');
                    }

                } else {
                   
                    int cnt = (i == 1) ? firstZeroBlock : 1;

                    for (int j = 0; j < cnt; j++) {
                        ans.append('0');
                    }
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}