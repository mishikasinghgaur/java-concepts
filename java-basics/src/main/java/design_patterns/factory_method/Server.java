package design_patterns.factory_method;

public class Server extends Computer{

    private String hdd;
    private String ram;

    public Server(String ram, String hdd){
        this.ram=ram;
        this.hdd=hdd;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }
}
