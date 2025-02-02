package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceClass {
    public static void main (String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 20; i++){
            int j = i;
            executorService.submit(() ->
                    System.out.println(Thread.currentThread()
                            .getName() + "is executing task" + j));
        }
        executorService.shutdown();
    }
}
