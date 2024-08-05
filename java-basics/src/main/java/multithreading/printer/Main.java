package multithreading.printer;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String [] args) throws ExecutionException, InterruptedException {
//        System.out.println("Hi world! from thread:" + Thread.currentThread().getName());
//        HelloWorldPrinter h = new HelloWorldPrinter();
//        Thread t1 = new Thread(h);
//        t1.start();
//
//        HelloWorldPrinter h2 = new HelloWorldPrinter();
//        Thread t2 = new Thread(h2);
//        t2.run();
//
//        for(int i=1;i<=100;i++){ // total threads created - 100
//            NumberPrinter np = new NumberPrinter(i);
//            Thread t = new Thread(np);
//            t.start();
//        }
//
//        // total threads created - 10
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for(int i=1;i<=100;i++){
//            if(i == 11 || i == 50 || i == 100){
//                System.out.println("Debug");
//            }
//            NumberPrinter np = new NumberPrinter(i);
//            executorService.submit(np);
//        }
        // to do -> check the delay when numbers of thread is 1, 2, and 5
        ExecutorService executors = Executors.newFixedThreadPool(2);
        RandomNumberGenerator generator1 = new RandomNumberGenerator();
        RandomNumberGenerator generator2 = new RandomNumberGenerator();

        Future<Integer> randomNumber1 = executors.submit(generator1);
        System.out.println("First Random Number" + generator1);
        Future<Integer> randomNumber2 = executors.submit(generator2);
        System.out.println("Second Random Number" + generator2);

        System.out.println("Hello World");
        System.out.println("SUM : " + (randomNumber1.get() + randomNumber2.get()));
        //some code here
    }
}