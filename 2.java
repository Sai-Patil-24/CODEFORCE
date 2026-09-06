import java.util.Scanner;
public class 2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x-->0)
        {
            int y =sc.nextInt();
            int arr[] = new int[y];
            for(int j = 0 ; j<y ;j++)
            {
                arr[j]=sc.nextInt();
            }
            
            int findex=0;
            int sindex=0;
            for(int j = 0 ; j<y ;j++)
            {   
                if(arr[j]==1)
                {
                    findex=j;
                }
            }
            for(int j = y-1 ; j>=0 ;j--)
            {
                if(arr[j]==1)
                {
                    sindex=j;
                }
            }
            for(int j = 0 ; j<y ;j++)
            {
                if(arr[j]==-1)
                {
                    arr[j]=0;
                }
            }
            for(int j = 0 ; j<y ;j++)
            {
            System.out.print(arr[j]+" ");
            }
        }

    }
}
