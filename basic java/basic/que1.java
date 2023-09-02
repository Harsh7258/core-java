package basic;
import java.util.Scanner;


public class que1 {
    public static void main(String[] args){

        try (Scanner marks = new Scanner(System.in)) {
            System.out.println("enter the Marks");
            

            System.out.println("enter maths marks: ");
            int maths = marks.nextInt();

            System.out.println("enter stc marks: ");
            int stc = marks.nextInt();

            System.out.println("enter science marks: ");
            int science = marks.nextInt();

            System.out.println("enter hindi marks: ");
            int hindi = marks.nextInt();

            System.out.println("enter english marks: ");
            int english = marks.nextInt();

            float total = ((maths + stc + science + hindi + english) / 500.0f)* 100;
            System.out.println("Total percent");
            System.out.println(total);
        }
    }

}
