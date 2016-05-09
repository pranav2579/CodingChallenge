/**
 * Created by Pranav on 09/05/16.
 */

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Solution {

    public static void main(String[] argh) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        ArrayList<BigDecimal> al = new ArrayList<BigDecimal>();
        for (int k = 0; k < n; k++) {
            BigDecimal bd = new BigDecimal(s[k]);
            al.add(bd);

        }
        Collections.sort(al, Collections.<BigDecimal>reverseOrder());

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(al.get(i));
        }

    }


}
