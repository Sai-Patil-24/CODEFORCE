import java.util.Scanner;
public class 25A_iq_test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                evenCount++;

            }
            else
            {
                oddCount++;
                
            }
        }

        if(evenCount > oddCount)
        {
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] % 2 != 0)
                {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
        else
        {
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] % 2 == 0)
                {
                    System.out.println(i + 1);
                    break;
                }
            }
        }

        sc.close();

    }
}
