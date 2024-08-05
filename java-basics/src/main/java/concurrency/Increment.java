package concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class Increment {

    private final ReentrantLock lock = new ReentrantLock();

    private int count = 0;

    public void increment() {
        lock.lock();
        try {
            this.count++;
        }
        finally {
            lock.unlock();
        }
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return this.count;
    }
}
