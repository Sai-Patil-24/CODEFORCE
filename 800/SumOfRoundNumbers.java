import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            java.util.List<Integer> list = new java.util.ArrayList<>();
            int power = 1;
            while (n > 0) {
                int digit = n % 10;
                if (digit > 0) {
                    list.add(digit * power);
                }
                n /= 10;
                power *= 10;
            }
            System.out.println(list.size());
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + (j == list.size() - 1 ? "" : " "));
            }
            System.out.println();
        }
        scanner.close();
    }
}