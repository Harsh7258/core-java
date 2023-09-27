import java.util.*;

public class function1 {
    public static void factorial(int n){

        if(n < 0){
            System.out.println("invalid number.");
            return;
        }

        int factorial = 1;
        for(int i = n; i >= 1; i--){
            factorial = factorial * i;        
        }
        System.out.println("factorial of number is : " + factorial);
        return;
    } 
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();

            factorial(n);
        }
    }
}
