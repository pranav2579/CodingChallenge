import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pranav on 15/05/16.
 */
public class RepeatAndMissing2 {
    public static ArrayList<Integer> repeatedNumber(final List<Integer> a) {

        //finding b-a;
        long normalSum = 0, currentSum = 0, difference = 0;

        for (int i = 1; i <= a.size(); i++) {
            normalSum += i;
            currentSum += a.get(i - 1);
        }

        difference = normalSum - currentSum;
        //boolean largestRepeated = false;
        long normalSqSum = 0, currnetSqSum = 0, sqDifference = 0;

        for (int i = 1; i <= a.size(); i++) {
            normalSqSum += i * i;
            currnetSqSum += a.get(i - 1) * a.get(i - 1);
        }

        sqDifference = normalSqSum - currnetSqSum;

        long aplusb = sqDifference / difference;

        long first = (aplusb + difference) / 2;

        long second = first - difference;

        ArrayList<Integer> solution = new ArrayList<Integer>();

        solution.add((int) second);
        solution.add((int) first);

        return solution;
    }

}
