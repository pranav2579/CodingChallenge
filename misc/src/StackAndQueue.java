import java.util.*;
import java.util.LinkedList;

/**
 * Created by Pranav on 17/05/16.
 */
public class StackAndQueue {
    Stack<Character> s = new Stack<Character>();
    Queue<Character> ll = new LinkedList<Character>();

    void pushCharacter(char ch){
        s.push(ch);
    }

    char popCharacter(){
        char ch = s.pop();
        return ch;
    }

    void enqueueCharacter(char ch){
        ll.add(ch);
    }

    char dequeueCharacter(){
        char ch = ll.remove();
        return ch;
    }

    public static void main(String[] args) {

        StackAndQueue sq = new StackAndQueue();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        char[] chars = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            sq.pushCharacter(chars[i]);
            sq.enqueueCharacter(chars[i]);
        }
        int i = 0;
        for ( i = 0; i < input.length(); i++) {
            if(sq.dequeueCharacter() == sq.popCharacter())
            continue;
            else
            break;
        }

        if(i == input.length())
            System.out.println("The word, "+ input+", is a palindrome.");
        else
            System.out.println("The word, "+ input+", is not a palindrome.");
    }
}
