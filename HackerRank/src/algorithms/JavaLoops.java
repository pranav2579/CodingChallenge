package algorithms;

import java.util.*;

public class JavaLoops {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */      
    	Scanner S = new Scanner(System.in);
    	int a, b, i,j,n,t,sum;
    	t = S.nextInt();
    	
    	for(i=0; i<t; i++)
    	{
    		a = S.nextInt();
    		b = S.nextInt();
    		n = S.nextInt();
    		sum = a;
    		
    		for(j=0; j<n; j++)
    		{
    			sum += ( Math.pow(2, j) * b);
    			System.out.print(sum+ " ");
    		}
    		System.out.print("\n");
    	}
        
    }
}