/**
 * Created by Pranav on 09/05/16.
 */

import java.util.Scanner;

public class HourGlass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int sumOfpattern = 0, maxsum = Integer.MIN_VALUE;
        for (int k = 1; k <= 4; k++) {
            for (int l = 1; l <= 4; l++) {
                sumOfpattern = 0;
                sumOfpattern = arr[k][l] + arr[k - 1][l] + arr[k - 1][l - 1] + arr[k - 1][l + 1]
                        + arr[k + 1][l] + arr[k + 1][l + 1] + arr[k + 1][l - 1];

                if (sumOfpattern > maxsum)
                    maxsum = sumOfpattern;
            }
        }
        System.out.println(maxsum);
    }
}