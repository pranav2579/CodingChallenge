package Hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class angry_professor {

	public static void main(String[] args) {
		
		int cases, total, present;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter number of Hackerrank.algorithms.test cases");
		cases = S.nextInt();
		if(cases >=1 && cases <=10){
			
			for(int i = 0; i<cases; i++){
				int count = 0;
				System.out.println("Enter number of students");
				total = S.nextInt();
				if(total>=1 && total<=1000){
					System.out.println("Enter minimum critera of present students");
					present = S.nextInt();
					if(present>=1 && present<=total){
						
						
						System.out.println("Input entry timing for students");
						for(int j = 0;j<total;j++){
							
								if(S.nextInt()<=0){
									count++;
								}
							}
								
						}
					
			
				if(count<=present){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
			}

	}}	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

	}

}
}