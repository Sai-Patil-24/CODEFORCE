import java.util.Scanner;
public class Dubstep{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String song = scanner.nextLine();
        String[] parts = song.split("WUB");
        StringBuilder originalSong = new StringBuilder();
        
        for (String part : parts) {
            if (!part.isEmpty()) {
                originalSong.append(part).append(" ");
            }
        }
        
        System.out.println(originalSong.toString().trim());
    }
}