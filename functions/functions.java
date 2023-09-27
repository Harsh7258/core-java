import java.util.*;

public class functions {
    public static void printMyName(String name){
        System.out.println(name);
    } 
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            String name = scan.next();

            System.out.println(name); // calling the function
        }
    }
}
