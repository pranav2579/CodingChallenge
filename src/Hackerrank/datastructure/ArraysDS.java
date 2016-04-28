package Hackerrank.datastructure;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArraysDS {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	int i,size,num;
    	
    	
    	Scanner S = new Scanner(System.in);
    	size = S.nextInt();
    	int[] numarray = new int[size];
    	for(i=0; i<size; i++)
    	{
    		num = S.nextInt();
    		numarray[i] = num;
    	}
    	for(i=size-1; i>=0; i--)
    	{
    		System.out.println(numarray[i]);
    	}
    	
    }
}