import java.util.Scanner;
public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int exp1=a*b*c;
        int exp2=a+b+c;
        int exp3=(a+b)*c;
        int exp4=a*(b+c);
        int exp5=a+b*c;
        int exp6=a*b+c;
        int max=Math.max(exp1,Math.max(exp2,Math.max(exp3,Math.max(exp4,Math.max(exp5,exp6)))));
        System.out.println(max);
        sc.close();
    }
}