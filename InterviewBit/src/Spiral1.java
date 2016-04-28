import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pranav on 15/01/16.
 */
public class Spiral1 {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int row = a.size();
        int column = a.get(0).size();

        if( row ==1)
            return(a.get(0));
        if(column == 1)
        {
            for (int i = 0; i < row; i++)
            {
                result.add(a.get(i).get(0));
            }
            return result;
        }
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = a.get(i).get(j);
            }
        }

        int T = 0, B = row - 1, L = 0, R = column - 1;
        int dir = 0;
        int k;

        //ArrayList<Integer> result = new ArrayList<Integer>();
        while (T <= B && L <= R) {
            if (dir == 0) {
                for (k = L; k <= R; k++) {
                    //System.out.println(matrix[T][k]);
                    result.add(matrix[T][k]);

                }
                T++;
                dir = 1;
            }
            else if (dir == 1) {
                for (k = T; k <= B; k++) {
                    //System.out.println(matrix[k][R]);
                    result.add(matrix[k][R]);
                }
                R--;
                dir = 2;
            }
            else if (dir == 2) {
                for (k = R; k >= L; k--) {
                    //System.out.println(matrix[B][k]);
                    result.add(matrix[B][k]);
                }
                B--;
                dir = 3;
            }
            else if (dir == 3) {
                for (k = B; k >= T; k--) {
                    //System.out.println(matrix[k][L]);
                    result.add(matrix[k][L]);
                }
                L++;
                dir = 0;
            }
        }

        return result;
    }

    }

