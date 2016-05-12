import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Pranav on 12/05/16.
 */
public class FirstMissingInteger {
    public int firstMissingPositive(ArrayList<Integer> a) {

        Collections.sort(a);
        int starting_index = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > 0) {
                starting_index = i;
                break;
                }
            }
        int j = 1;
        int i = starting_index;
        int first_missing = 0;
        while ( i < a.size()) {
            if(a.get(i) == j){
                i++;
                j++;
        }
            else
                 first_missing = j;
        }
      return first_missing;
    }
}
