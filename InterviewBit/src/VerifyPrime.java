/**
 * Created by Pranav on 01/01/16.
 */
public class VerifyPrime {

    public static int isPrime(int a) {
        if(a == 1)
            return 0;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a%i == 0){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int prime = isPrime(39601);
        System.out.println(prime);
    }


}
