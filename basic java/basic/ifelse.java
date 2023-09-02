package basic;
import java.util.*;

 public class ifelse {
//     public static void main(String[] args){
//         System.out.print("ENETR YOUR AGE : ");
//         try (Scanner scan = new Scanner(System.in)) {
//             int age = scan.nextInt();

//             if (age >= 18){
//                 System.out.println("adult");
//             }
//             else{
//                 System.out.println("you are minor");
//             }
//         }
        
//     }




public static void main(String args[]){
    System.out.print("enter any number : ");
    try (Scanner scan = new Scanner(System.in)) {
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("eve n");
        }
        else {
            System.out.println("odd");
        }
    }
}
 }


