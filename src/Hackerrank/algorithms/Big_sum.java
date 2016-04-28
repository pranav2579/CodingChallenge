package Hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Big_sum {

    public static void main(String[] args) {
    	int n,i;
    	long num,sum;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        sum = 0;
        for( i =0;i< n;i++)
        {
        	num = s.nextLong();
        	sum += num;
        }
      
      System.out.println(sum);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
