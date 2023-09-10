package threads;

class myThread1 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("thread 1 is running");
        }
    }
}

class mytherad2 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("thread 2 is running");
        }
    }
}
public class mytherad{
    public static void main(String[] args) {

        myThread1 t1 = new myThread1();
        mytherad2 t2 = new mytherad2();

        t1.start();
        t2.start();
    }
}
