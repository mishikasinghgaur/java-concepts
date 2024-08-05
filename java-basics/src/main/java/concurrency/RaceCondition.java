package concurrency;

public class RaceCondition {
  public static void main(String[] args) {
      Increment eg = new Increment();
      for (int i = 0; i < 50; i++) {
        Thread thread = new Thread(eg::increment);
        thread.start();
      }
      System.out.println(eg.getCount());
    }
}

