/**
 * Created by Pranav on 24/11/15.
 */

        import java.util.*;


public class Multiple3and5 {

    public static void main(String[] args) {

        int T,i;
        int num,j;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner S = new Scanner(System.in);
        T = S.nextInt();
        for(i=0; i<T ; i++){
            num = S.nextInt();
            int sum = 0;
            int a=0;
            for(j=0;j<num;j=j+15){
                if(num>=j+15)
                    sum= sum+7*j+60;
                else
                {
                    if(num>=j+12)
                    {
                        sum=sum+6*j+45;
                    }
                    else
                    {
                        if(num>=j+10)
                        {
                            sum=sum+5*j+33;
                        }
                        else
                        {
                            if(num>=j+9)
                            {
                                sum=sum+4*j+23;
                            }
                            else
                            {
                                if(num>=j+6)
                                {
                                    sum=sum+3*j+14;
                                }
                                else {
                                    if (num >= j + 5)
                                    {
                                        sum = sum + 2 * j + 8;
                                    }
                                    else
                                    {
                                        if (num >= j + 3) {
                                            sum = sum + j + 3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
            System.out.println(sum-num);


        }

    }
}