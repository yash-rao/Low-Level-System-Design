package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory s = new ShapeFactory();
        Shape sh = s.getShape("CIRCLE");
        sh.draw();
    }
}
