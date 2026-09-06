import java.util.Scanner;
public class 1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int freq=0;
        for(int i = 0; i < x; i++) {
            int y = sc.nextInt();
            int arr[] = new int[y];
            for(int j = 0; j < y; j++) {
                arr[j] = sc.nextInt();
                arr[j]=Math.abs(arr[j]-2);
                freq=Math.max(arr[j],freq);
            }
        }
        System.out.println(freq);
    }
}
