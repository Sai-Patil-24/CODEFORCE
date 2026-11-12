    import java.util.*;
    public class Three_Piles{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();


                //both players takes zero
                int score = 0;
                
                //first player chance
                

                //choose 0 
                score=Math.abs(a-b);

                //choose all from c 
                score=Math.max(score,Math.abs(a-b+c));

                System.out.println(score);
                
                sc.close();
            }
        }
    }