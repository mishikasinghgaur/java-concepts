package design_patterns.factory_method;

public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory=new ShapeFactory();

        Shape s1 = shapeFactory.getShape("CIRCLE");

        s1.draw();

    }
}
