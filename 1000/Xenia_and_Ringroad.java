import java.util.Scanner;
public class Xenia_and_Ringroad{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long totaltime=0;
        int current=1;
        for(int i=0; i<m; i++)
        {
            int move = sc.nextInt();
            if(move>=current)
            {
                totaltime+=move-current;
                current=move;
            }
            else
            {
                totaltime+=n-current+move;
                current=move;
            }
        }
        System.out.println(totaltime);
    }
}