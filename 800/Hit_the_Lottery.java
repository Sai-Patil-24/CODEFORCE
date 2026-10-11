import java.util.Scanner;
public class Hit_the_Lottery {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = n/100;
        n %= 100;
        count += n/50;
        n %= 50;
        count += n/20;
        n %= 20;
        count += n/10;
        n %= 10;
        count += n/5;
        n %= 5;
        count += n;

        System.out.println(count);
    }
}
