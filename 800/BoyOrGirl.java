import java.util.Scanner;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int uniqueChars = (int) name.chars().distinct().count();
        
        if (uniqueChars % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        
        scanner.close();
    }
}
