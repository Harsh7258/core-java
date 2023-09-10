package threads;

class myThreadrun1 implements Runnable{
    public void run(){
        System.out.println("thread is running....");
    }
}

public class mythread2 {
    public static void main(String[] args) {
        myThreadrun1 num = new myThreadrun1();
        Thread t1 = new Thread(num);

        t1.start();
}
}
