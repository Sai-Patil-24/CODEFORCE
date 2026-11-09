import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int n = scanner.nextInt();
        int groups = 0;
        String prev = "";

        for (int i = 0; i < n; i++) {
            String current = scanner.next();
            if (!current.equals(prev)) {
                groups++;
                prev = current;
            }
        }

        System.out.println(groups);
        scanner.close();
    }
}