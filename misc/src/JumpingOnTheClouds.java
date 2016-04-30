import java.util.Scanner;

/**
 * Created by Pranav on 30/04/16.
 */
public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int c_j = 0, steps = 0;
        while (c_j < n - 1) {

            if (c_j == n - 2) {
                c_j++;
                steps++;
                break;
            }
            if ((c[c_j + 1] == 0 && c[c_j + 2] == 0) || (c[c_j + 1] == 1 && c[c_j + 2] == 0)) {
                c_j = c_j + 2;
                steps++;
            } else {
                c_j++;
                steps++;
            }
        }
        System.out.println(steps);
    }
}