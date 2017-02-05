package javaproblems;

import java.util.Scanner;

/**
 * Created by Pranav on 05/02/17.
 */
public class javastaticinitializerblock {

    public static int H;
    public static int B;

    static {
        Scanner S = new Scanner(System.in);
        H = S.nextInt();
        B = S.nextInt();
        if (H < 0 || B < 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
            if(H>=0 && B >=0)
                System.out.println(H * B);
    }

}
