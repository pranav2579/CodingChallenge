package Hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class matrix_diagonal {

    public static void main(String[] args) {
    	int n,i,j,topdown = 0 , bottomup = 0,difference;
    	
    	Scanner S = new Scanner(System.in);
    	n = S.nextInt();
    	
    //initialization of matrix
    	int[][] matrix = new int[n][n];
    	for(i=0; i<n; i++)
    		for(j=0; j<n; j++)
    			matrix[i][j] = 0;
    
    // taking values in matrix
    	for(i=0; i<n; i++)
    		for(j=0; j<n; j++)
    			matrix[i][j] = S.nextInt() ;
    	
    //calculating sum of diagonals
    	for(i=0; i<n; i++)
    		for(j=0; j<n; j++)
    			if(i==j)
    			 topdown += matrix[i][j];
    	
    	for(i=0,j=n-1; i<n && j>=0; i++,j--)
    			 bottomup += matrix[i][j];
    	
    	difference = Math.abs(Math.abs(topdown) - Math.abs(bottomup));
    	System.out.println(difference);
    				
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}