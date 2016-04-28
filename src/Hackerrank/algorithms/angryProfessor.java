package Hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class angryProfessor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	int i,j,temp,counter,T,N,K;
    	Scanner S = new Scanner(System.in);
    	T = S.nextInt();
    	for(i = 0; i<T;i++){
    		
    		N = S.nextInt();
    		K = S.nextInt();
    		counter = 0;
    		for(j=0;j<N;j++){
    			temp = S.nextInt();
    			if(temp<=0)
    				counter++;   			
    		}
    		if(counter>=K)
    			System.out.println("YES");
    		else
    			System.out.println("NO");
    		
    	}
    }
}
