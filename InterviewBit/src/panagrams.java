import java.util.Scanner;

public class panagrams {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        String input = S.nextLine();
        input = input.toLowerCase();

        int[] hash = new int[26];
        for (int i = 0; i < 26; i++) {
            hash[i] = 0;
        }
        char[] s1 = input.toCharArray();

        for(char element:s1){
            int index = element - 'a';
            if(index >=0 && index<=26){
                hash[index]++;
            }
        }
        boolean flag = true;
        for(int j:hash){
            if(j==0){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("pangram");
        else
            System.out.println("not pangram");



        }
}