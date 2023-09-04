import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class string2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("original string : ");
        String name = scan.nextLine();

        String result = "result : ";

        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == 'e'){
                result += 'i';
            }
            else{
                result += name.charAt(i);
            }
        }

        System.out.println(result);
    
    }
}
