import java.util.*;

public class strings {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        // string
        String name = "harsh";

        //string input
        System.out.println("enter last name : ");
        String lastName = scan.next();

        //concatinate +
        String fullName = name + " " +lastName;
        System.out.println(fullName);

        // length() of fullName
        System.out.println(fullName.length());

        //access fullName by aplhabets by *charAt*
        for(int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    
        // comparing two strings 
        if(name.compareTo(lastName) == 0){
            System.out.println("its a match!!");
        }
        else{
            System.out.println("it is not match to harsh harsh.");
        }

        // substrings
        System.out.println(fullName.substring(0, 7));

        //pasreInt
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        //int to strings
        int number2 = 123;
        String str2 = Integer.toString(number2);
        System.out.println(str2.length());
  }
}
