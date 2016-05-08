/**
 * Created by Pranav on 08/05/16.
 */

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> s = new Stack<Integer>();
        int remainder;

        while (n > 0) {
            remainder = n % 2;
            s.push(remainder);
            n = n / 2;
        }

        int count = 0, maxsofar = 0;
        Iterator<Integer> i = s.iterator();
        while (i.hasNext()) {
            if (i.next() == 1) {
                count++;
                if (count > maxsofar)
                    maxsofar = count;
            } else {
                if (count > maxsofar)
                    maxsofar = count;
                count = 0;
            }
        }
        System.out.println(maxsofar);
    }
}