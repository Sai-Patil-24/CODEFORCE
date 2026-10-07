```java
import java.util.*;

public class Taxi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] passengers = new int[n];

        for (int i = 0; i < n; i++) {
            passengers[i] = scanner.nextInt();
        }

        Arrays.sort(passengers);

        int i = 0;
        int j = n - 1;
        int taxis = 0;

        while (i <= j) {
            if (passengers[i] + passengers[j] <= 4) {
                i++;
            }
            j--;
            taxis++;
        }

        System.out.println(taxis);
        scanner.close();
    }
}
```
