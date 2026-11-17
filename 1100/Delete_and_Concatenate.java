import java.util.Scanner;

public class Delete_and_Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);7

        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int c = sc.nextInt();
            
            int [] a = new int[n];
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
           
            if(n==1)
            {
                System.out.println(a[0]);
                break;
            }

    
            int score = 0;
            int max = 0;
            // operation 1
            for(int i = 0; i < n; i++)
            {
                score = Math.max(score, score + a[i] - c);
            }

            // operation 2
            int score2 = 0;
            int i = 0;
            int j =1;
            while(j < n)
            {
                if(a[i]>a[j])
                {
                    score2 += a[i] - c;
                    i = j;
                    j++;
                }
                else
                {
                    score2 += a[j] - c;
                    j++;
                }
            }
            

            System.out.println(Math.max(score, score2));

        sc.close();
    }
}