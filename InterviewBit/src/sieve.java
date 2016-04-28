import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Pranav on 01/01/16.
 */
public class sieve {
    public static ArrayList<Integer> sieve(int a) {
        int[] Prime = new int[a];
        for (int i = 0; i < a; i++) {
            Prime[i] = 1;
        }
        Prime[0] = Prime[1] = 0;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            for (int j = 2; i*j< a; j++) {
                if(Prime[i] == 1){
                    Prime[i*j] = 0;
                }
            }
        }
        ArrayList<Integer> Alist = new ArrayList<Integer>();
        for (int i = 0; i < a; i++) {
            if(Prime[i] == 1)
                Alist.add(i);
        }
        Collections.sort((Alist));
        return Alist;
    }

    public static void main(String[] args) {
        ArrayList<Integer> answer = sieve(7);
        System.out.println(answer);
    }
}
