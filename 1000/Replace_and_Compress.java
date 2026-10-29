import java.util.*;

public class Replace_and_Compress {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while(t-- > 0) {
            String s = sc.next();
            int n = s.length();
            
            boolean canIncrease = false;
            boolean canDecrease = false;
            
            // Loop through characters, skipping the first and last ones
            for(int i = 1; i < n - 1; i++) {
                
                // Check if we have "000" or "111"
                if(s.charAt(i - 1) == s.charAt(i) && s.charAt(i) == s.charAt(i + 1)) {
                    canIncrease = true;
                }
                
                // Check if we have "010" or "101"
                if(s.charAt(i - 1) != s.charAt(i) && s.charAt(i) != s.charAt(i + 1)) {
                    canDecrease = true;
                }
            }
            
            // The answer is 1 (the string if we make 0 changes) 
            // +1 if we can increase the length, +1 if we can decrease the length
            int ans = 1;
            if(canIncrease) ans++;
            if(canDecrease) ans++;
            
            System.out.println(ans);
        }
        sc.close();
    }
}