import java.util.Scanner;

/**
 * Created by Pranav on 22/11/15.
 */
public class FindDigits {
    public static void main(String args[]){


        int N,i,count;
        long digit,temp,num;

        Scanner s = new Scanner(System.in);
        N = s.nextByte();

        for(i = 0;i<N;i++){
            num = s.nextLong();
            temp = num; // testing the git commit from Intellij IDE
            count = 0;
            while(temp>0){
                digit = temp%10;

                if(digit !=0 && num%digit == 0)
                    count++;
                temp = temp/10;
            }
            System.out.println(count);

        }

    }
}
