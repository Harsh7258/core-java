import java.util.*;

public class loopque5 {
    public static void main(String arrgs[]){
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();

            boolean isPrime = true;

            for(int i = 2; i <= n/2; i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                if(n == 1){
                    System.out.println("this is prime nor composite.");
                }
                else{
                    System.out.println("this is prime number.");
                }
            }
                else{
                    System.out.println("this is not prime number.");
                }
        }

        }
    }

