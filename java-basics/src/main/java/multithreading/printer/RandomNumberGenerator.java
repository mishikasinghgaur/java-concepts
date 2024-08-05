package multithreading.printer;

import java.util.Random;
import java.util.concurrent.Callable;
public class RandomNumberGenerator implements Callable{

    public RandomNumberGenerator() {
    }

    public Integer call() throws InterruptedException {
        Thread.sleep(3000L);
        Random random = new Random();
        Integer i = random.nextInt();
        System.out.println("Number generated : " + i + " on thread," + Thread.currentThread().getName());
        return i;
    }
}
