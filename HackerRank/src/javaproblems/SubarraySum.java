package javaproblems;

/**
 * Created by Pranav on 09/05/16.
 */

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int size;
        Scanner s = new Scanner(System.in);

        size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int sum = 0; int count = 0;
        for (int j = 0; j < size; j++) {
            for (int k = j; k < size; k++) {
                sum = 0;
                for (int l = j; l <= k; l++) {
                    sum += arr[l];
                }
                if(sum<0)
                    count++;
            }

        }
        System.out.println(count);
    }
}
