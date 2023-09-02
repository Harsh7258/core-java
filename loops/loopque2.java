import java.util.*;

public class loopque2 {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("enter the value for table: ");
            int n = scan.nextInt();

            // int tableOFn = 1;
            for(int i = 1; i <= 10; i++){
                //  tableOFn = n * i;
                //  System.out.println(tableOFn);
                 System.out.println(i * n);
            }
        }
        
    }
}
