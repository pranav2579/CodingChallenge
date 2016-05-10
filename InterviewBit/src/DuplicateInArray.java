import java.util.List;

/**
 * Created by Pranav on 10/05/16.
 */
public class DuplicateInArray {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        int[] arr = new int[a.size()];
        int answer = 0;
        for (int i = 0; i < a.size(); i++) {
            arr[i] = 0;
        }

        for (int j = 0; j < a.size(); j++) {
            if(arr[a.get(j)] == 0){
                arr[a.get(j)]++;
            }
            else{
                answer = a.get(j);
                break;
            }
        }
        return answer;
    }
}
