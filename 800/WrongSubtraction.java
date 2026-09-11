import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int subtractions = scanner.nextInt();

        for (int i = 0; i < subtractions; i++) {
            if (number % 10 == 0) {
                number = number / 10;
            } else {
                number = number - 1;
            }
        }

        System.out.println(number);
        scanner.close();
    }
}