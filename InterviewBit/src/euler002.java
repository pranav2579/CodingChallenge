/**
 * Created by Pranav on 16/12/15.
 */

import java.util.*;

public class euler002 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long sum = 0;
        int i, T, N;
        long a, b, fib;

        Scanner S = new Scanner(System.in);
        T = S.nextInt();
        for (i = 0; i < T; i++) {
            sum = 0;
            N = S.nextInt();
            a = 0;
            b = 1;
            fib = 0;
            while (fib <= N) {
                if (fib % 2 == 0)
                    sum += fib;
                fib = a + b;
                a = b;
                b = fib;
            }

            System.out.println(sum);


        }

    }
}
