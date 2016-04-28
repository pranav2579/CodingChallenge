package algorithms;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Pranav on 28/04/16.
 */
public class DateTesting {

    public static void main(String[] args) throws Exception {

        SimpleDateFormat parseformat = new SimpleDateFormat("hh:mm:ss a");
        Date d = parseformat.parse("01:23:23 AM");
        System.out.println(d);
        SimpleDateFormat displayformat = new SimpleDateFormat("hh:mm");

        System.out.println(displayformat.format(d));


    }
}

