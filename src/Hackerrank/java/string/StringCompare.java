package Hackerrank.java.string;
import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	int i,j,k;
    	String input,min,max,sub;
    	
    	Scanner S = new Scanner(System.in);
    	input = S.nextLine();
    	k = S.nextInt();
    	
    	min = max = input.substring(0,k-1);
    	
    	for(i=0,j=k; j<=input.length();i++,j++)
    	{
    		sub = input.substring(i,j);
    		if(sub.compareTo(min) < 0)
    			min = sub;
    		if(sub.compareTo(max) > 0)
    			max = sub;
    	}
    	System.out.println(min);
    	System.out.println(max);
    }
}