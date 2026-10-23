import java.util.*;
public class Vanya_and_Lanterns
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] positions = new int[n];
        for (int i = 0; i < n; i++) {
            positions[i] = sc.nextInt();
        }

        Arrays.sort(positions);

        int maxDistance = 0;
        for (int i = 0; i < n - 1; i++) {
            int distance = (positions[i + 1] - positions[i]) / 2;
            if (distance > maxDistance) {
                maxDistance = distance;
            }
        }

        double leftDistance = positions[0];
        double rightDistance = l - positions[n - 1];
        System.out.println(Math.max(maxDistance, Math.max(leftDistance, rightDistance)));
    }

}
