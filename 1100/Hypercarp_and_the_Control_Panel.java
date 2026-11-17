import java.util.*;

public class Hypercarp_and_the_Control_Panel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Step 1: Compress adjacent identical elements into runs
            List<Integer> runLengths = new ArrayList<>();
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    count++;
                } else {
                    runLengths.add(count);
                    count = 1;
                }
            }
            runLengths.add(count);
            
            int totalRuns = runLengths.size();
            boolean hasRunAtLeastTwo = false;
            boolean hasAdjacentRunsAtLeastTwo = false;
            
            // Step 2: Check run lengths to see how much 1 swap can help
            for (int i = 0; i < totalRuns; i++) {
                if (runLengths.get(i) >= 2) {
                    hasRunAtLeastTwo = true;
                    if (i > 0 && runLengths.get(i - 1) >= 2) {
                        hasAdjacentRunsAtLeastTwo = true;
                    }
                }
            }
            
            // Step 3: Compute the final answer
            if (hasAdjacentRunsAtLeastTwo) {
                System.out.println(totalRuns + 2);
            } else if (hasRunAtLeastTwo && totalRuns >= 2) {
                System.out.println(totalRuns + 1);
            } else {
                System.out.println(totalRuns);
            }
        }
        sc.close();
    }
}