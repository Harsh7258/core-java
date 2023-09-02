package basic;
// import java.util.Scanner;            -----------> Importing  the Scanner class
// Scanner sc = new Scanner(System.in); -----------> Creating an object named "sc" of the Scanner class.


import java.util.Scanner;
public class takinginputs {
    public static void main(String[] args ){
        System.out.println("enter the values");
        try (Scanner num = new Scanner(System.in)) {
            System.out.println("enter a: ");
      // int a = num.nextInt();
      float a = num.nextFloat();  // float decimal values
            System.out.println("enter b: ");
      // int b = num.nextInt();
      float b = num.nextFloat();  // float decimal values
      // int sum = a + b;       // float decimal values
      float sum = a + b;
            System.out.println("sum of numbers : ");
            System.out.println(sum);
        }
    }
}
