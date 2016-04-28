import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Pranav on 01/01/16.
 */
public class Primesum {
    public static ArrayList<Integer> sieve(int a) {
        int[] Prime = new int[a];
        for (int i = 0; i < a; i++) {
            Prime[i] = 1;
        }
        Prime[0] = Prime[1] = 0;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            for (int j = 2; i * j < a; j++) {
                if (Prime[i] == 1) {
                    Prime[i * j] = 0;
                }
            }
        }
        ArrayList<Integer> Alist = new ArrayList<Integer>();
        for (int i = 0; i < a; i++) {
            if (Prime[i] == 1)
                Alist.add(i);
        }
        Collections.sort((Alist));
        return Alist;
    }

    public static ArrayList<Integer> primesum(int a) {
        ArrayList<Integer> Primelist = sieve(a);
        int begin, end, sum;
        begin = 0;
        end = Primelist.size()-1;
        ArrayList<Integer> Solution = new ArrayList<Integer>();
        while (begin <= end) {
            sum = Primelist.get(begin) + Primelist.get(end);
            if (sum == a) {
                Solution.add(Primelist.get(begin));
                Solution.add(Primelist.get(end));
                return Solution;
            } else if (sum < a) {
                begin++;
            } else {
                end--;
            }

        }
        return Solution;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ans= new ArrayList<Integer>();
        ans = primesum(11);

    }
}

