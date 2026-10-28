import java.util.*;
public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
                System.out.println("OK");
            } else {
                int count = map.get(arr[i]);
                System.out.println(arr[i] + count);
                map.put(arr[i], count + 1);
            }
        }


        sc.close();

       
    }
}