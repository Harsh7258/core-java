import java.util.*;

public class string3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your email address : ");
        String email = scan.nextLine();

        System.out.print("userName : ");
        String username = "";

        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }
            else{
                username += email.charAt(i); 
            }
        }
        System.out.println(username);
    }
}
