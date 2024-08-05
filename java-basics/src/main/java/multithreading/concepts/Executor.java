package multithreading.concepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor {
    public static void main(String[] args){
        Task t = new Task("Mishika");

        ExecutorService service = Executors.newSingleThreadExecutor();
        Future result = service.submit(t);

        System.out.println(result);

        service.shutdown();
    }
}
