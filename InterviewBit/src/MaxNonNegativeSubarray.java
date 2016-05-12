import java.util.ArrayList;

/**
 * Created by Pranav on 12/05/16.
 */
public class MaxNonNegativeSubarray {
    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {

        Long sumSoFar = 0L;
        Long maxSum = 0L;

        ArrayList<Integer> currentList = new ArrayList<Integer>();
        ArrayList<Integer> maxList = new ArrayList<Integer>();

        for(int i = 0;i<a.size(); i++) {

            if(a.get(i) >= 0){
                currentList.add(a.get(i));
                sumSoFar += a.get(i);
            }

            if(sumSoFar > maxSum){
                maxSum = sumSoFar;
                maxList.clear();
                maxList.addAll(currentList);
            }
            else if(sumSoFar == maxSum && (currentList.size() > maxList.size() )){
                maxList.clear();
                maxList.addAll(currentList);

            }
            if(a.get(i) < 0){
                sumSoFar = 0L;
                currentList.clear();
            }
        }
        return maxList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(756898537);
        al.add(-5);
        al.add(-7);
        al.add(-2);
        al.add(1424268980);
        System.out.println(al);
        ArrayList<Integer> solution = maxset(al);
        System.out.println(solution);
    }

}

