package string;
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        
        Scanner S =new Scanner(System.in);
        String A = S.next();
        
        StringBuffer Sb = new StringBuffer(A);
        String B = Sb.reverse().toString();
        
        if(A.equals(B))
        	System.out.println("Yes");
        else
        	System.out.println("No");
        
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
