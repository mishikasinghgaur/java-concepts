package multithreading.printer;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        //write the code to achieve the task
        System.out.println("HelloWorld" + Thread.currentThread().getName());

    }
}
