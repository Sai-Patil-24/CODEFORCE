import java.util.Scanner;
public class Word{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        int uc=0;
        int lc=0;
        for(char i : str.toCharArray())
        {
            if(Character.isUpperCase(i))
            {
                uc++;
            }
            else if(Character.isLowerCase(i))
            {
                lc++;
            }
        }

        if(uc>lc)
        {
            System.out.println(str.toUpperCase());
        }
        else
        {
            System.out.println(str.toLowerCase());
        }

    }
}