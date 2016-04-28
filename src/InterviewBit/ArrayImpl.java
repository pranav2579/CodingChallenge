import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Pranav on 02/01/16.
 */
public class ArrayImpl {

    public static ArrayList<Integer> performOps(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
            B.set(i, A.get(i));
            B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;


    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(5, 10, 2, 1));
        ArrayList<Integer> B = performOps(A);
        for (int i = 0; i < B.size(); i++) {
            System.out.print(B.get(i) + " ");
        }
    }
}
