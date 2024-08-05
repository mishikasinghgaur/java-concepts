package basics;

public class Main {

    public static void main(String[] args){
        Base d = new Derived();
        d.print();
        Base.run();
        Derived.run();

    }
}
