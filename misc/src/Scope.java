/**
 * Created by Pranav on 12/05/16.
 */

import java.util.Arrays;
import java.util.Scanner;


class Difference {
    private int[] elements;
    public int maximumDifference;
// Add your code here
        public Difference(int[] a){
            this.elements = a;
        }

        public void computeDifference(){
            Arrays.sort(elements);
            int size = elements.length;
            this.maximumDifference = elements[size-1] - elements[0];
        }


}
 // End of Difference class

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
    }
}