package concurrency;

import java.sql.SQLSyntaxErrorException;

public class ThreadRunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread name" + Thread.currentThread().getName());
    }

    public static void main(String[] args){
        String s;
        ThreadRunnableInterface t = new ThreadRunnableInterface();
        Thread th = new Thread(t);
        th.start();
    }
}
