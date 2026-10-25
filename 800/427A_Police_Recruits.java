import java.util.Scanner;

public class 427A_Police_Recruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int availableOfficers = 0;
        int untreatedCrimes = 0;
        
        for (int i = 0; i < n; i++) {
            int event = scanner.nextInt();
            
            if (event > 0) {
                availableOfficers += event;
            } else if (event == -1) {
                if (availableOfficers > 0) {
                    availableOfficers--;
                } else {
                    untreatedCrimes++;
                }
            }
        }
        
        System.out.println(untreatedCrimes);
        scanner.close();
    }
}