import java.util.Scanner;
public class String_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String result = "";
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='y')
            {
                continue;
            }
            else
            {
               result+=("."+str.charAt(i));
            }
        }
        System.out.println(result);
    }
}