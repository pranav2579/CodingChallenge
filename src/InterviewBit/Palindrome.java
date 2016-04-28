/**
 * Created by Pranav on 15/01/16.
 */
public class Palindrome {
    public static boolean isPalindrome(int a) {
        if(a<0)
            return false;

        String num = String.valueOf(a);


        StringBuilder S = new StringBuilder(num);
        String Original = S.toString();
        String rev = S.reverse().toString();

        if (Original.equals(rev))
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int a = 123;
        boolean ans = isPalindrome(a);
        System.out.println(ans);
    }
}

