import com.sun.deploy.security.MozillaJSSDSASignature;

import java.util.Scanner;

/**
 * Created by Pranav on 26/12/15.
 */
public class LCS {

    public static int LCS(String A, int i, String B, int j){
        int m = A.length();
        int n = B.length();
        char[] C = A.toCharArray();
        char[] D = B.toCharArray();
        int _i,_j,LCS = 0;
        for(_i = 0;_i<m;_i++){
            for(_j = 0;_j<n;_j++){
                if(C[_i] == D[_j]){
                    LCS++;
                    i++;
                    j++;
                }
                else
                    LCS = Math.max(LCS(A,i+1,B,j),LCS(A,i,B,j+1));
            }
        }


        return LCS;
    }

    public static void main(String[] args) {
        String A;
        String B;
        int m;
        int n;
        Scanner S = new Scanner(System.in);
        A = S.next();
        B = S.next();



        m = A.length();
        n = B.length();

        int longestCommonSubsequence = LCS(A,0,B,0);
        System.out.println(A);
        System.out.println(B);

    }

}
