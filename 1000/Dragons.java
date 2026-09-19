import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int currentStrength = input.nextInt();
        int numberOfDragons = input.nextInt();
        
        int[][] dragonStats = new int[numberOfDragons][2];
        
        for (int i = 0; i < numberOfDragons; i++) {
            dragonStats[i][0] = input.nextInt();
            dragonStats[i][1] = input.nextInt();
        }
        
        Arrays.sort(dragonStats, (dragon1, dragon2) -> Integer.compare(dragon1[0], dragon2[0]));
        
        for (int i = 0; i < numberOfDragons; i++) {
            if (currentStrength > dragonStats[i][0]) {
                currentStrength += dragonStats[i][1];
            } else {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
        input.close();
    }
}