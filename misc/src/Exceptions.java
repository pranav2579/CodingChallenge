/**
 * Created by Pranav on 15/05/16.
 */

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try{
            int numericvalue = Integer.parseInt(S);
            System.out.println(numericvalue);
        }
        catch(Exception e){
            System.out.println("Bad String");
        }
    }
}