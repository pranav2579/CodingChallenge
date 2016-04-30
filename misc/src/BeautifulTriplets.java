import java.util.Scanner;

import static java.util.Arrays.binarySearch;

/**
 * Created by Pranav on 30/04/16.
 */

public class BeautifulTriplets {

    public static void main(String[] args) {
        int size, diff, tripletCount = 0;
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        diff = s.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }

        for (int index = 1; index <= size - 2; index++) {
            if ((binarySearch(array, 0, index , array[index] - diff) >= 0) && (binarySearch (array, index + 1, size , array[index] + diff) >= 0))
            {
                tripletCount++;
            }
        }
        System.out.println(tripletCount);
    }
}


