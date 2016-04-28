package algorithms;

import java.util.*;
import java.math.*;

public class extra_long_factorial {

    public static void main(String[] args) {
    	
    	int n,i,j,k;
    	BigInteger factorial = BigInteger.valueOf(1);
    	Scanner S = new Scanner(System.in);
    	n = S.nextInt();
    	
    	while(n>0)
    	{
    		factorial = factorial.multiply(BigInteger.valueOf(n));;
    		n--;
    	}
    	
    	System.out.println(factorial);
    	
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

