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

        double maxDistance = 0;
        for (double i = 0; i < n - 1; i++) {
            double distance = (positions[(int)(i + 1)] - positions[(int)i]) / 2.0;
            if (distance > maxDistance) {
                maxDistance = distance;
            }
        }

        double leftDistance = positions[0];
        double rightDistance = l - positions[n - 1];
        System.out.println(Math.max(maxDistance, Math.max(leftDistance, rightDistance)));
    }

}
