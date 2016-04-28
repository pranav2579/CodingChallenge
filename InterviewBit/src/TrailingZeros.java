/**
 * Created by Pranav on 28/04/16.
 */
public class TrailingZeros {

        public int trailingZeroes(int a) {
            int i;
            int count = 0;
            for(i = 5;a/i>0;i *= 5)
            {
                count += a/i;
            }

            return count;
        }


}
