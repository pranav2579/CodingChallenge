import java.util.ArrayList;

/**
 * Created by Pranav on 11/05/16.
 */
public class AddOneToNumber {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        int i = a.size()-1;
        while(i>=0){
            int sum = a.get(i) + 1;
            if( sum == 10 ){
                a.set(i,0);
                i--;
            }
            else{
                a.set(i,sum);
                break;
            }
        }

        if(i<0){
            ArrayList<Integer> a1 = new ArrayList<>(a.size()+1);

            a1.add(1);
            for (int j = 1; j <= a.size(); j++) {
                a1.add(j,0);
            }
            return a1;
        }
        int start = 0;
        while(a.get(start) == 0) {
                a.remove(start);
            }

        return a;
    }

    public static void main(String[] args) {
        ArrayList<Integer> t1 = new ArrayList();
        t1.add(0);
        t1.add(6);
        t1.add(0);
        t1.add(6);
        t1.add(4);
        ArrayList s1 = AddOneToNumber.plusOne(t1);
        System.out.println(s1);

    }
}
