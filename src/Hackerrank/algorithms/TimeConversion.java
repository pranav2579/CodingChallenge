package Hackerrank.algorithms;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Pranav on 28/04/16.
 */
public class TimeConversion {
    public static void main(String[] args) throws Exception{
        Scanner S = new Scanner(System.in);
        String inputTime;
        inputTime = S.nextLine();
        //System.out.println(inputTime);
        StringBuffer sb = new StringBuffer(inputTime);
        sb.insert(sb.length()-2," ");

        inputTime = sb.toString();
        //System.out.println(inputTime);

        SimpleDateFormat parseformat = new SimpleDateFormat("hh:mm:ss a");
        Date d = parseformat.parse(inputTime);
        SimpleDateFormat displayformat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(displayformat.format(d));
    }
}
