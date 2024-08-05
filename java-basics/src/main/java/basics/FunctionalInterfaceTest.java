package basics;

public class FunctionalInterfaceTest {
    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Started new thread");
            }
        }).start();

//        new Thread(()-> {
//            System.out.println("New thread");
//        }).start();
    }
}
