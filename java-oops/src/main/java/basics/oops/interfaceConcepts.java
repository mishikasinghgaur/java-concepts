package basics.oops;

// Java Program for
// implementation Level wise

import java.lang.*;


// Level 1
interface Bank {
    void deposit();
    void withdraw();
    void loan();
    void account();
}

// Level 2
abstract class Dev1 implements Bank {
    public void deposit()
    {
        System.out.println("Your deposit Amount :" + 100);
    }
}

abstract class Dev2 extends Dev1 {
    public void withdraw()
    {
        System.out.println("Your withdraw Amount :" + 50);
    }
}

abstract class Dev4 extends Dev1 {
    public void withdraw()
    {
        System.out.println("Your withdraw Amount :" + 70);
    }
}

// Level 3
class Dev3 extends Dev2{
    public void loan() {}
    public void account() {}
}

// Level 4
public class interfaceConcepts {
    public static void main(String[] args)
    {
        Dev3 d = new Dev3();
        d.account();
        d.loan();
        d.deposit();
        d.withdraw();
    }
}

