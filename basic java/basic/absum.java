package basic;
import java.util.*;

public class absum {
    public static void main(String[] args){
        System.out.println("enter the numbers");
        try (Scanner scan = new Scanner(System.in)) {
            float a = scan.nextInt();
            float b = scan.nextInt();
            float sum = a + b;
            System.out.println("the sum is " + sum);
        }
    }
}
