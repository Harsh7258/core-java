import java.util.Scanner;

public class loopque1 {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();

            int sum = 0;
            for(int i = 0; i <= n; i++){
                 sum = sum +i;
                
            } 
            System.out.println(sum);
        }
    }
}
