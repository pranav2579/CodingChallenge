/**
 * Created by Pranav on 21/12/15.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hourglass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int maxsum = 0;
        boolean initialized = false;
        for(int i=1; i < 5; i++){
            for(int j=1; j < 5; j++){
                int sum = 0;
                sum+= arr[i-1][j-1] +arr[i-1][j] + arr[i-1][j+1] +arr[i][j] + arr[i+1][j-1] +arr[i+1][j] + arr[i+1][j+1];

                if(sum>maxsum || initialized == false) {
                    initialized = true;
                    maxsum = sum;
                }

            }
        }
        System.out.println(maxsum);
    }
}