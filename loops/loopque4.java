import java.util.*;

public class loopque4 {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            int input;

            do {
                int marks = scan.nextInt();
                if(marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } 
                else if(marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } 
                else if(marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } 
                else {
                    System.out.println("Invalid");
                }
                System.out.println("Want to continue ? (yes(1) or no(0))");
                input = scan.nextInt();
      
            } while(input == 1);
        }
    }   
 }
 
