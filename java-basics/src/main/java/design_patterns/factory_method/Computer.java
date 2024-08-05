package design_patterns.factory_method;

public abstract class Computer {

    public abstract String getHDD();
    public abstract String getRAM();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD();
    }

}
