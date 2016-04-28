package Hackerrank.algorithms;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyStrings {

    public static void main(String[] args) {
    	int T,i,j,k;
    	String Str;
    			
    	Scanner S = new Scanner(System.in);
    	T = S.nextInt();
    	for (i = 0; i<T ; i++)
    	{
    		Str = S.next();
    		StringBuilder Sb =  new StringBuilder(Str);
    		StringBuilder RStr = Sb.reverse();
    		boolean IsFunny = true;
    		
    		for (j = 1; j<Str.length() ; j++)
    		{
    			char s1,s2,r1,r2;
    			int i1,i2,j1,j2;
    			s1 = Str.charAt(j-1); 
    			s2 = Str.charAt(j);
    			i1 = (int)s1;
    			i2 = (int)s2;
    			
    			r1 = RStr.charAt(j-1);
    			r2 = RStr.charAt(j);
    			j1 = (int)r1;
    			j2 = (int)r2;
    			
    			if(Math.abs(i2-i1) != Math.abs(j2-j1))
    			{
    				IsFunny = false;
    				break;
    			}
    			
    		}
    		if(IsFunny)
    			System.out.println("Funny");
    		else
    			System.out.println("Not Funny");
    		
    	}
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
