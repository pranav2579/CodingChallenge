import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Pranav on 01/01/16.
 */
public class RoateArray {

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        int temp;
        temp = A.get(B % A.size());
        for (int i = 0; i < A.size(); i++) {
            ret.add(A.get(i + B));
        }
        ret.add(temp);
        return ret;
    }

    public static void main(String[] args) {
        ArrayList<Integer> Alist = new ArrayList<Integer>(
                Arrays.asList(14, 5, 14, 34, 42, 63, 17, 25, 39, 61, 97, 55, 33, 96, 62, 32, 98, 77, 35)
        );

        ArrayList<Integer> Blist  = rotateArray(Alist,10);
        System.out.println(Blist);

    }
}
