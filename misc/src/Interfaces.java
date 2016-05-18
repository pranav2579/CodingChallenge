import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Pranav on 18/05/16.
 */
public class Interfaces {
    public int divisorSum(int n){
        Set<Integer> s = new HashSet<Integer>();
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                s.add(i);
            }
        }
        Iterator i = s.iterator();
        while(i.hasNext()){
            sum += (Integer)i.next();
        }
        return sum;
    }
    }

