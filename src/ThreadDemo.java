

//class myThread extends Thread{
//    public void run(){
//        System.out.println("Thread is created");
//    }
//}
class myThread implements Runnable{
    public  void run(){
        System.out.println("Thread is created");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        myThread t = new myThread();
        t.run();
    }
}