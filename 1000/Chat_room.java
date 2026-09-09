import java.util.Scanner;
public class Chat_room{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String target = "hello";
        int j=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==target.charAt(j))
            {
                j++;
            }
            if(j==5)
            {
                break;
            }
        }

        if(j==5)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}