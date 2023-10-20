package questions;
import java.util.*;

public class reverseSentence {
    public static void main(String[] args) {
        String sentence = "ronaldo sancho modric kroos";
        
        String str[] = sentence.split(" ");
        String result = " ";

        for(int i = str.length - 1; i>=0; i--){
            result += str[i] + " ";
        }
        System.out.println("reversed: " + result);
    }
}
