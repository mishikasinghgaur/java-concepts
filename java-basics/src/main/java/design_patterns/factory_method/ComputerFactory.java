package design_patterns.factory_method;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd){
        if("PC".equalsIgnoreCase(type)){
            return new PC(ram, hdd);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd);
        }else {
            return null;
        }
    }
}
