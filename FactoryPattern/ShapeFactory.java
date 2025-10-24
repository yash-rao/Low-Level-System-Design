package FactoryPattern;



public class ShapeFactory {
    
    Shape getShape(String input){

        switch(input) {
            case "CIRCLE": 
                return (new Circle());
            case "TRIANGLE": 
                return (new Triangle());
            default: 
                return (new Circle());
        }
    }
}
