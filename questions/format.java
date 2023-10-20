package questions;

public class format {
        public static void main(String[] args) {
             float a = 5.43f;
             float b = 2.653f;
             float result = a/b;
             System.out.print(result);
            
            
            // Your code here to print upto 3 decimal places  
        
    }
    static void printInFormat(float a, float b){
        //dividing a by b
        float result = a/b;
        
        //printing without formatting
        System.out.print(result + " ");
        
        //printing with formatting
        System.out.format("%.3f", result);
}
}
