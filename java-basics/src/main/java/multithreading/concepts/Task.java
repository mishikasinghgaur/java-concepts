package multithreading.concepts;

import java.util.concurrent.Callable;

public class Task implements Callable {

    private final String message;

    Task(String m){
        this.message = m;
    }

    @Override
    public Object call() throws Exception {
        return "Hiii" + message;
    }
}
