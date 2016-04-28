/**
 * Created by Pranav on 27/12/15.
 */
import java.util.*;

public class collection {

    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        Set s = m1.entrySet();
        System.out.println(s);
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
    }
}