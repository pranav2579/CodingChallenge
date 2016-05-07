import java.util.Scanner;

/**
 * Created by Pranav on 07/05/16.
 */

public class Factorial {
    public static int factorial(int n){
        if(n == 1)
            return n;
        else
            return(n*factorial(n-1));
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int fact = Factorial.factorial(n);
        System.out.println(fact);
    }
}