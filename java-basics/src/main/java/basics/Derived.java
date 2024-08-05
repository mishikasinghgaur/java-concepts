package basics;

public class Derived extends Base {
    static void run(){
       System.out.println("Run2");
   }

   @Override
   public void print(){
       super.print();
       System.out.println("Print2");
   }
}
