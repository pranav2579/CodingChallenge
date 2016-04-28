import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args)

    {
        Scanner S = new Scanner(System.in);
        String S1 = S.nextLine();
        StringBuffer sb = new StringBuffer(S1);
        sb.reverse();
        System.out.println(sb);
    }
}