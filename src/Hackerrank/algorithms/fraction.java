package Hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class fraction {

    public static void main(String[] args) {
    	
    	int n,i,num;
    	float pcount = 0 , ncount = 0,zcount=0; 
    	float a,b,c,sum = 0;
    	
    	Scanner S = new Scanner(System.in);
    	n = S.nextInt();
    	for(i=0;i<n;i++)
    	{
    		num = S.nextInt();
    		if (num >= 0)
    		{
    			if(num > 0)
					pcount++;
				else
					zcount++;
    		}					
			else
				ncount++; 
    	}
   a = pcount/sum;
   b = ncount/sum;
   c = zcount/sum;
   sum = pcount + zcount + ncount;
   //System.out.print("%f \n, %f \n ,%f \n", pcount/sum , ncount/sum , zcount/sum);
    System.out.println( a );	
    System.out.println( b );
    System.out.println( c);	
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}