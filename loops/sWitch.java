import java.util.*;

public class sWitch {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("enter the number: ");

            int button = scan.nextInt();
            switch(button){
                case 1 : System.out.println("hello");
                 break;
                case 2 : System.out.println("namaste");
                 break;
                case 3 : System.out.println("hola");
                 break;
                default : System.out.println("invaild");
   }
        }
}
}
