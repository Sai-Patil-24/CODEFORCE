import java.util.Scanner;

public class caps_lock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder();

        boolean upper = true;

        
        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLowerCase(c)) {
                upper = false;
                break;
            }
        }

        if (upper) {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (Character.isLowerCase(c)) {
                    output.append(Character.toUpperCase(c));
                } else {
                    output.append(Character.toLowerCase(c));
                }
            }

            System.out.println(output);
        } else {
            System.out.println(input);
        }

        scanner.close();
    }
}