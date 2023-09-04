import java.util.*;

public class string1 {
    public static void main(String args[]){
        // Scanner scan = new Scanner(System.in);

        // System.out.println("enter first string to add :");
        // String name1 = scan.nextLine();

        // System.out.println("enter second string to add :");
        // String name2 = scan.nextLine();

        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;
   
   
        for(int i=0; i<size; i++) {
          array[i] = sc.next();
          totLength += array[i].length();
        }
        System.out.println(totLength);
      }
   }