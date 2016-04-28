import java.io.*;
import java.util.*;

public class anagram {

   static boolean isAnagram(String A, String B) {
	   
	   if(A.length() != B.length())
		  return false;
	   char[] a = A.toLowerCase().toCharArray();
	   char[] b = B.toLowerCase().toCharArray();
	   
	   Arrays.sort(a);
	   Arrays.sort(b);
	   
	   
	   boolean flag = true;
	   for(int i=0;i<A.length();i++)
	   {
		   if(a[i] != b[i])
		   {
			   flag = false;
			   break;
		   }
			   
	   }
	   
	   return(flag);
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
