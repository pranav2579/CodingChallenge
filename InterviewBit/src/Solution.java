import java.util.ArrayList;
import java.util.Collections;

 class Solution1 {
    public static String findDigitsInBinary(int a) {
        if (a == 0)
            return("0");
        int rem;
        ArrayList<Integer> Alist = new ArrayList<Integer>();
        while(a>0){
            rem = a%2;
            Alist.add(rem);
            a /= 2;
        }
        Collections.reverse(Alist);
        String s1 = "";
        for (int i:Alist)
        {
            s1 += String.valueOf(i);
        }
        return s1;
    }
    public static void main(String[] args) {
        String abc = findDigitsInBinary(125);

        System.out.println(abc);
    }
}