package algorithms;

import java.util.Scanner;

/**
 * Created by Pranav on 28/04/16.
 */
public class LibraryFine {

    public static void main(String[] args) {

        int fine = 0;
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();


        if(y2 < y1 )
            fine = 10000;
        else if(y2 == y1 && m2 < m1)
            fine = (m1-m2)*500;
        else if(y2==y1 && m2==m1 && d2 < d1)
            fine = (d1-d2)*15;

        System.out.println(fine);
    }
}
