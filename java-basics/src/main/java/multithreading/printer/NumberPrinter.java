package multithreading.printer;

public class NumberPrinter implements Runnable{
    private int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    public void run() {
        int var10001 = this.number;
        System.out.println("Number printer : " + var10001 + " on thread " + Thread.currentThread().getName());
    }
}
