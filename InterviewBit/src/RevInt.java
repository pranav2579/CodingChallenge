/**
 * Created by Pranav on 16/01/16.
 */
public class RevInt {
    public int reverse(long a) {
        if (a < Integer.MIN_VALUE || a > Integer.MAX_VALUE )
            return 0;

        long temp = a;
        if (a < 0)
            temp = a * -1;

        String num = String.valueOf(temp);
        StringBuilder S = new StringBuilder(num);
        String rev = S.reverse().toString();

        long result = Long.valueOf(rev);
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
            return 0;
        if (a < 0)
            result *= -1;
        return (int) result;
    }

    public static void main(String[] args) {
        long a = 5827646411L;
        RevInt r = new RevInt();
        long rev = r.reverse(a);
        System.out.println(rev);

    }


}
