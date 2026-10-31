import java.util.Scanner;
public class Robot_Odd_Moves {

    static int move(int a, int b, int x, int y, int op) {

    if (x == a && y == b) {
        return op;
    }
    
    
    if ((x == a && y + 1 == b) || (x == a && y - 1 == b)) {
     
        return op + 1; 
    }
    
    
    if (x > a || y > a + 1 || y < -(a + 1)) {
        return -1;
    }
    
    int path1 = move(a, b, x + 1, y + 1, op + 1);
    int path2 = move(a, b, x + 1, y - 1, op + 1);
    
    return Math.min(path1, path2);
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = move(a, b, 0, 0, 0);
            System.out.println(result);

            
            
            
        }
        sc.close();
    }
}
