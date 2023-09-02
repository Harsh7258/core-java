package basic;
// enter value is integer or not


import java.util.Scanner;
public class que2 {
    public static void main(String[] args){
        System.out.println("enter the value");
        try (Scanner x = new Scanner(System.in)) {
            System.out.println(x.hasNextInt());
        }
    }
    

}
