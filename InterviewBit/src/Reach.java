import java.util.ArrayList;

/**
 * Created by Pranav on 15/01/16.
 */

public class Reach {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int steps = 0;
        int Start1 = 0, End1 = 0, Start2 = 0, End2 = 0;
        int dx, dy;
        for (int i = 0; i < X.size() - 1; i++) {
            Start1 = X.get(i);
            End1 = Y.get(i);

            Start2 = X.get(i + 1);
            End2 = Y.get(i + 1);

            dx = Math.abs((Start1) - (Start2));
            dy = Math.abs((End1) - (End2));

            while (dx > 0 && dy > 0) {
                dx--;
                dy--;
                steps++;
            }
            while (dx > 0) {
                dx--;
                steps++;
            }
            while (dy > 0) {
                dy--;
                steps++;
            }
        }
        return steps;
    }

}
