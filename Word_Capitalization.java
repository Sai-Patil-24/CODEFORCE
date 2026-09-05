import java.util.Scanner;
public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        
        if (word.length() > 0) {
            char firstChar = Character.toUpperCase(word.charAt(0));
            String capitalizedWord = firstChar + word.substring(1);
            System.out.println(capitalizedWord);
        } else {
            System.out.println(word); 
        }
        
        scanner.close();
    }
}
