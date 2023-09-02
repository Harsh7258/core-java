package basic;
public class Testgarbage1{

    public void finalize(){
   System.out.println("object is garbage collected");
   }
   
    public static void main(String args[]){
     Testgarbage1 s1 = new Testgarbage1();
     Testgarbage1 s2 = new Testgarbage1();
     s1=null;
     s2=null;
     System.gc();
    }
   }