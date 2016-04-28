/**
 * Created by Pranav on 16/01/16.
 */
public class Power2 {

    public boolean isPower(int a) {
        double INT_MAX = Math.pow(2.0, 31.0);
        if (a <= 1)
            return true;

        for (int base = 2; base < a && base < INT_MAX / base; base++) {
            int temp = base;
            while (temp <= a && temp < INT_MAX / base) {
                temp *= base;
                if (temp == a) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a = 37;
        Power2 p2 = new Power2();
        boolean result = p2.isPower(a);
        System.out.println(result);
    }


}
