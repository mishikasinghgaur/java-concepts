package concurrency;

public class Threadclass extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args){
        System.out.println("Entered thread class");
        Threadclass t = new Threadclass();

        System.out.println("Started therad");
        t.start();
    }
}
