package questions;

public class reverseString {
    public static void main (String[] args) {
       
        String str= "harsh", 
        nstr="";
       
      System.out.print("Original word: ");
      System.out.println("harsh"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        char ch = str.charAt(i); //extracts each character
        nstr = ch + nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
