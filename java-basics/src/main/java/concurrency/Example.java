package concurrency;

public class Example extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args){
//        Example ex = new Example();
        Example t = new Example();
        t.start();
    }
}
