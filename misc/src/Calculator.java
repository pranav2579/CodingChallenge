import java.util.Scanner;
/**
 * Created by Pranav on 15/05/16.
 */

public class Calculator {

    public int power(int n,int p) throws Exception{

        int answer = 0;
        if(n < 0 || p < 0){
            throw new Exception("n and p should be non-negative");
        }
        else{
           Double solution = Math.pow((double)n,(double)p);
            answer = solution.intValue();
        }
        return answer;
    }

}
 class Solution1 {


        public static void main(String []argh)
        {
            Scanner in = new Scanner(System.in);
            int T=in.nextInt();
            while(T-->0)
            {
                int n = in.nextInt();
                int p = in.nextInt();
                Calculator myCalculator = new Calculator();
                try
                {
                    int ans=myCalculator.power(n,p);
                    System.out.println(ans);

                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }

        }
    }
