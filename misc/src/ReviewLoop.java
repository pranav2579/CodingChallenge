import java.util.Scanner;

/**
 * Created by Pranav on 07/05/16.
 */

public class ReviewLoop {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String input;
        char[] cinput;

        for (int i = 0; i < n; i++) {
            input = s.next();
            cinput = input.toCharArray();
            for (int j = 0; j < input.length(); j+=2) {
                System.out.print(cinput[j]);
            }
            System.out.print(" ");
            for (int j = 1; j < input.length(); j+=2) {
                System.out.print(cinput[j]);
            }

        }
    }
}