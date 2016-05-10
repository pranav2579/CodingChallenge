import java.util.Collections;
import java.util.List;

/**
 * Created by Pranav on 10/05/16.
 */

public class MaxSumContinuousArray {
    // DO NOT MODFIY THE LIST.
    public int maxSubArray(final List<Integer> a) {

        boolean allNegative = true;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > 0) {
                allNegative = false;
                break;
            }
        }
        if (allNegative) {
            Collections.sort(a , Collections.<Integer>reverseOrder());
            return a.get(0);
        }

        int max_so_far = 0;
        int max_ending_here = 0;
        int size = a.size();
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
        }

        return max_so_far;
    }
}