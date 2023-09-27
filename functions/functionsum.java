import java.util.*;

// public class functionsum {
//     public static int calculateSum(int a, int b){
//         int sum = a + b;
//         return sum;
//     }

//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int a = scan.nextInt();
//         int b = scan.nextInt();

//         // int sum = calculateSum(a, b);
//         System.out.println(calculateSum(a, b));
//     }
// }


public class functionsum {
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(multiply(a, b));
        }
    }
}
