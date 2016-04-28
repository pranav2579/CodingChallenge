package Hackerrank.algorithms;

import java.util.Scanner;

public class staircase {

    public static void main(String[] args) {
    	
    	int rows,i,j,k;
    	
    	Scanner S = new Scanner(System.in);
    	rows = S.nextInt();
    	for(i = 1; i<= rows ; i++)
    	{
    		for(j = rows-i; j>0 ; j--)
    		{
    			System.out.print(" ");
    		}
    		for(k = rows-i; k<rows ; k++)
    		{
    			System.out.print("#");
    		}
    		System.out.print("\n");
    	}
    		
    	
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

