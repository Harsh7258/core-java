import java.util.*;

public class stringbuilder1 {
    public static void main(String args[]){

        StringBuilder sb = new StringBuilder("string builder");
        System.out.println(sb);
        // System.out.println("enter the string to reverse :");
        // Scanner scan= new Scanner(System.in);
        

        for(int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
