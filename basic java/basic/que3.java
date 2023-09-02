package basic;
// kilometers to milews conveter


import java.util.Scanner;

public class que3 {
    public static void main(String[] args){
         System.out.println("Enter the value to change");
         try (Scanner dist = new Scanner(System.in)) {
            double x = dist.nextDouble();
             double ans = x * 0.621371; 
             System.out.println(ans);
        }
    }
}
