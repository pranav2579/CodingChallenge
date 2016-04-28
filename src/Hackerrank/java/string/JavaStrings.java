package Hackerrank.java.string;

import java.util.Scanner;

 public class JavaStrings {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int length;
        length = A.length() + B.length();
        System.out.println(length);
        if(A.compareToIgnoreCase(B)>0) 
        	System.out.println("YES");
        else 
        	System.out.println("NO");
        

            char[] stringArray1 = A.toCharArray();
            stringArray1[0] = Character.toUpperCase(stringArray1[0]);
            String A1 = new String(stringArray1);
            
            char[] stringArray2 = B.toCharArray();
            stringArray2[0] = Character.toUpperCase(stringArray2[0]);
            String B1 = new String(stringArray2);
            
            System.out.println(A1+" "+B1);
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
